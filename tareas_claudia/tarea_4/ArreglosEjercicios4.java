import java.util.*;

public class ArreglosEjercicios4 {

    public static final int NUMBEROFZEROS = 10;
    private int arrayLength;
    private int[] arrayShuffledNumbers;

    public ArreglosEjercicios4(int arrayLenght, int[] arrayShuffledNumbers) {
        this.arrayLength = arrayLenght;
        this.arrayShuffledNumbers = arrayShuffledNumbers;
    }

    /**
     * @return Un array de longitud 10, con cada posicion con valor de 10.
     */
    private int[] zero() {
        int[] aux = new int[NUMBEROFZEROS];
        for (int i = 0; i < NUMBEROFZEROS; i++) {
            aux[i] = 0;
        }
        return aux;
    }

    /**
     * Metodo que me regresa un arreglo con 10 ceros en posicines
     * aleatorias.
     * @return Arreglo con 10 ceros en posiciones aleatorias.
     */
    public int[] getArray() {
        if (arrayLength > NUMBEROFZEROS) {
            final int a[] = shuffleNumbers(arrayLength);
            for (int i = 0; i < NUMBEROFZEROS; i++) {
                a[arrayShuffledNumbers[i]] = 0;
            }
            return a;
        }
        return zero();
    }

    /**
     * Dado un arreglo suma 1 cada posicion del arreglo.
     * @return Arglo con cada posicion un 1 sumado
     */
    public int[] addOne(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] += 1;
        }
        return array;
    }

    /**
     * Dado un arreglo de enteros imprime usando una lambda los 5 números mayores del
     * arreglo
     * @param array Arreglo a comprar
     */
    public void printFiveBiggerNumberOfArray(int[] array){
        List<Integer> list = new ArrayList<>();
        for (int i : array){
            list.add(i);
        }
        Collections.sort(list);
        list.subList(list.size()-5,list.size()).
                forEach((i) -> System.out.println(i));
    }


    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int n = 0;

        System.out.println("Dame un numero igual o menor que 10");
        do {
            try {
                n = l.nextInt();
                System.out.println("Debe de ser igual o menor que 10");
            }catch (InputMismatchException e){
                System.out.println("DEBES DE INGRESAR NUMEROS!!!!");
                System.exit(1);
            }
        }while(n <10);

        final int []shuffledNumbers = shuffleNumbers(n);
        int [] y = {1,2,3,4,5};

        ArreglosEjercicios4 obj = new ArreglosEjercicios4(n, shuffledNumbers);

        for (int i : obj.getArray()){
            System.out.print("---"+ i);
        }
        System.out.println("..........\n");
        for (int i : obj.addOne(y)){
            System.out.print("---"+ i);
        }
        System.out.println("..........\n");
        obj.printFiveBiggerNumberOfArray(new int[]{9,5,7,4,7,4,2,1,1,1,2,3});

    }

    /**
     * @return Un arreglo de numero revultos sin repeticion
     * que seran usado para los indices en un arreglo.
     */
    static public int[] shuffleNumbers(int arrayLength) {
        int []arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = i;
        }

        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }

        Collections.shuffle(list);
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

}