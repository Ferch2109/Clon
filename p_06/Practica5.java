
import java.util.Random;

/**
 * Práctica 5: Estructuras de control y listas.
 */
public class Practica5 {

    public static void main(String[] args) {
        Random random = new Random();
        int total = 10 + random.nextInt(90);
        ListaCadena lista = new ListaCadena();
        int i;

        for (i = 0; i < total/2; i++) {
            if (lista.getLongitud() != i) {
                System.out.println("La longitud de la lista es incorrecta.");
                System.exit(1);
            }
            String r = String.valueOf(random.nextInt(total));
            lista.agregaFinal(r);
            lista.ultimo();
            if (!lista.get().equals(r)) {
                System.out.println("Error al agregar al final.");
                System.exit(1);
            }
        }

        for (i = total/2; i < total; i++) {
            if (lista.getLongitud() != i) {
                System.out.println("La longitud de la lista es incorrecta.");
                System.exit(1);
            }
            String r = String.valueOf(random.nextInt(total));
            lista.agregaInicio(r);
            lista.primero();
            if (!lista.get().equals(r)) {
                System.out.println("Error al agregar al inicio.");
                System.exit(1);
            }
        }

        i = 0;
        String[] a = new String[total];
        lista.primero();
        while (lista.iteradorValido()) {
            System.out.printf("Elemento %d: %s\n", i, lista.get());
            a[i++] = lista.get();
            lista.siguiente();
        }

        System.out.println("Lista: " + lista);

        for (i = 0; i < total; i++) {
            if (!lista.get(i).equals(a[i])) {
                System.out.printf("Error al obtener el %d-ésimo elemento.\n", i);
                System.exit(1);
            }
        }

        while (lista.getLongitud() > 0) {
            int n = random.nextInt(lista.getLongitud());
            String e = lista.get(n);
            System.out.printf("Eliminando %s...\n", e);
            lista.elimina(e);
            System.out.println("Lista resultante: " + lista);
        }

        System.out.println("La cadena está vacia: " + lista.esVacia());

        for (i = 0; i < total/2; i++) {
            if (lista.getLongitud() != i) {
                System.out.println("La longitud de la lista es incorrecta.");
                System.exit(1);
            }
            String r = String.valueOf(random.nextInt(total));
            lista.agregaFinal(r);
            lista.ultimo();
            if (!lista.get().equals(r)) {
                System.out.println("Error al agregar al final.");
                System.exit(1);
            }
        }

        System.out.println("Lista: " + lista);
        System.out.println("La cadena está vacia: " + lista.esVacia());

        System.out.println("Eliminando primero");
        lista.eliminaPrimero();
        System.out.println("Lista resultante: " + lista);

        System.out.println("Eliminando ultimo");
        lista.eliminaUltimo();
        System.out.println("Lista resultante: " + lista);

        System.out.println("Contiene 5?: " + lista.contiene("5"));
        System.out.println("Indice 5: " + lista.indiceDe("5"));
        System.out.println("Reversa: " + lista.reversa());

        System.out.println("Copia: " + lista.copia());

        System.out.println("Obteniendo primero: " + lista.getPrimero());        
        System.out.println("Obteniendo ultimo: " + lista.getUltimo());        

        System.out.println("Limpiando");
        lista.limpia();
        System.out.println("Lista: " + lista);
    }
}
