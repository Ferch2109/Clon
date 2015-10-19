import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Cartas {

    final String[] cara = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    final String[] palo = {"Corazon", "Diamante", "Picas", "Trebol"};

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";

    Scanner l = new Scanner(System.in);

    String[][] carta = new String[palo.length][cara.length];

    public List<String> getCartasBarajeadas() {
        return cartasBarajeadas;
    }

    public void setCartasBarajeadas(List<String> cartasBarajeadas) {
        this.cartasBarajeadas = cartasBarajeadas;
    }

    List<String> cartasBarajeadas = new ArrayList<>();

    public void menu() {
        limpiarPantalla();

        System.out.println("1.- Crear un paquete de cartas");
        System.out.println("2.- Barajear las cartas");
        System.out.println("3.- Repartir las cartas");
        System.out.println("4.- Salir del prorama");

        switch (l.nextInt()) {
            case 1:
                crearPaqueteCartas();
                break;
            case 2:
                barajearLasCartas(0);
                break;
            case 3:
                repartirLasCartas();
                break;
            case 4:
                salir();
                break;
            default:
                salir();
        }
    }


    public void setCarta(String[][] carta) {
        this.carta = carta;
    }

    private void crearPaqueteCartas() {
        String[][] carta = new String[palo.length][cara.length];
        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < cara.length; j++) {
                if (i % 2 == 0) {
                    carta[i][j] = String.valueOf(ANSI_RED +
                            palo[i] + " " + cara[j] + ANSI_RESET + "\t");
                } else
                    carta[i][j] = String.valueOf(ANSI_BLUE +
                            palo[i] + " " + cara[j] + ANSI_RESET + "\t");
            }
        }
        setCarta(carta);

        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < cara.length; j++) {
                System.out.print(carta[i][j]);
            }
            System.out.println("\n");
        }
        volver();

    }

    /**
     * Barajear y mostrarlas usando lambdas.
     */
    private void barajearLasCartas(int flag) {
        List<String> barajear = new ArrayList<>();
        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < cara.length; j++) {
                if (i % 2 == 0)
                    barajear.add(carta[i][j] = String.valueOf(ANSI_RED +
                            palo[i] + " " + cara[j] + ANSI_RESET + "\t"));
                else
                    barajear.add(carta[i][j] = String.valueOf(ANSI_BLUE +
                            palo[i] + " " + cara[j] + ANSI_RESET + "\t"));

            }
        }

        Collections.shuffle(barajear);
        if(flag == 0){
            barajear.forEach(n -> System.out.print(n + "  "));
            volver();
        }
        setCartasBarajeadas(barajear);

    }

    private void repartirLasCartas() {
        int n = 0;
        String x= "";
        barajearLasCartas(1);

        System.out.println("Repartir todas las cartas teclea[1]?\n"
            + "REpartir una por una [2]");
        try{

            int opc = l.nextInt();
            if(opc == 2){
                System.out.println("SOLO APRIETA ENTER");
                while (!(n == 52)){
                    x = l.nextLine();
                    System.out.print(getCartasBarajeadas().get(n));
                    n++;
                }
            }
            else if(opc == 1){
                getCartasBarajeadas().forEach(System.out::println);
            }
        } catch (Exception e){
            System.out.println("TE DIJE QUE SOLO PRESIONES ESAS OPCIONES!!!");
        }
        volver();

    }

    private void volver() {
        System.out.println("\nQuieres regresar al menu?");
        System.out.println("Teclea [1] para ir al menu o culquier numero para salir");
        switch (l.nextInt()) {
            case 1:
                menu();
                break;
            default:
                salir();
        }
    }

    private void salir() {
        System.exit(1);
    }

    private void limpiarPantalla() {
        final String ANSI_CLS = "\u001b[2J";
        final String ANSI_HOME = "\u001b[H";
        System.out.print(ANSI_CLS + ANSI_HOME);
        System.out.flush();
    }


    public static void main(String[] args) {
        new Cartas().menu();
    }
}