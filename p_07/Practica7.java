import java.util.ArrayList;
/**
* Clase que nos permitira saber si nuestra lista sirve corrctamente
*/
public class Practica7{

    public static void main(String[] args) {
        int total = 6;
        Lista lista = new Lista();
        int i;

        ArrayList<Object> list = new ArrayList<Object>();
        list.add(new Animal("Gato", "felino", "bipedo", "casa", "croquetas"));
        list.add(new Animal("Perro", "perrito", "bipedo", "casa", "pedigree"));
        list.add(new Estudiante("Angel", 313112470));
        list.add(new Estudiante("Nicole", 234567880));
        list.add(new Persona("Gladin"));
        list.add(new Persona("Fernanda"));

        for (i = 0; i < total; i++) {
            
            lista.agregaFinal(list.get(i));
            lista.ultimo();
            if (!lista.get().equals(list.get(i))) {
                System.out.println("Error al agregar al final.");
                System.exit(1);
            }
        }

        for (i = total; i < total; i++) {
            lista.agregaInicio("r");
            lista.primero();
            if (!lista.get().equals("r")) {
                System.out.println("Error al agregar al inicio.");
                System.exit(1);
            }
        }

        i = 0;
        String[] a = new String[total];
        lista.primero();
        while (lista.iteradorValido()) {
            System.out.printf("Elemento %d: %s\n", i, lista.get());
            a[i++] = lista.get().toString();
            lista.siguiente();
        }

        System.out.println("Lista: " + lista);

        for (i = 0; i < total; i++) {
            if (!lista.get(i).equals(list.get(i))) {
                System.out.printf("Error al obtener el %d-ésimo elemento.\n", i);
                System.exit(1);
            }
        }

        while (lista.getLongitud() > 0) {
            String e = (String)lista.get(0).toString();
            System.out.printf("Eliminando %s...\n", e);
            lista.elimina(lista.get(0));
            System.out.println("Lista resultante: " + lista);
        }
    }
        
}