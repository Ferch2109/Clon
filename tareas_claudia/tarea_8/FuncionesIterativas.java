/**
 *
 * <p>Tarea 8: Clase que muestra funciones iterativas</p>
 *
 * <p>Se tenian los metodos recursivos y la tarea era pasarlos a iterativos.</p>
 *
 * @author Angel Ivan Gladin G
 * @version 1.0
 * @date 04-nov-15.
 */
public class FuncionesIterativas{
    
    /**
     * Metodo que devuelve la multiplicacion de valores en un arreglo desde la 
     * posicion 0 hasta el la posicion <code>tam</code>
     */
    public static int funcion_1 (int[] arr, int tam) {
        int valorFinal = 1;
        for (int i = tam; i>= 0 ; i--) {
             valorFinal *= arr[i];
        }
        return valorFinal;
    }

	/**
     * Metodo que devuelve el maximo comun divisor
     */
    public static int funcion_2(int a, int b) {
    	int res;
    	int i = mayorDeDosElementos(a, b);
    	while(a%i != 0 || b%i != 0){
    		i--;
    	}
    	return i;
    }

    private static int mayorDeDosElementos(int a, int b){
    	if (a > b) return a;
    	return b; 
    }

    /**
     * Metodo que dice si un numero es positivos o negativo.
     */
    public static boolean funcion_3(int n){
        if(n > 0) return true;
        return false;
    }

    /**
     * Metodo que regresa la suma de mas a y b. 
     */
    public static int funcion_4(int a, int b) {
        return a + b;
    }

    /**
     * Metodo que regresa el numero "n" de la sucesion de fibonacci.
     */
    public static int funcion_5(int n){
    	int num = 1;
    	int auxAnt = 0;
    	int res = 0;
    	for (int i = n; i>0 ; i--) {
    	 	auxAnt = num; 
    	 	num = res;
    	 	res = auxAnt + num;
    	}
    	return res; 
    }

    /**
     * Metodo que nos regresa el numero mas grande de un arrglo desde la posicion
     * 0 hasta laposicion con el valor <code>n</code>.
     */
    public static int funcion_6(int[] a, int n) {
    	a = selectionSort(a);
    	return a[n];
    }

    /**
     * Metodo selection sort que regresa el arreglo ordenado.
     */
    private static int[] selectionSort(int[] arr){
    	int aux;
    	int i,j;
    	int arrLength = arr.length;

    	for (i = 0; i<arrLength; i++) {
			for (j = i+1; j<arrLength; j++) {
			    if(arr[i] > arr[j]){
			    	aux = arr[i];
			    	arr[i] = arr[j];
			    	arr[j] = aux;
			    }
			}    		
    	}

    	return arr;
    }

    /**
     * Metodo que suma cada unos de los digitos en de un numero dado. 
     */
    public static int funcion_7 (int a) {
    	String aux = a+"";
    	int res = 0;
    	for (int i = 0; i<aux.length(); i++) {
    		res += Integer.parseInt(""+aux.charAt(i));
    	}
    	return res;
    }

    /**
     * Metodo que nos devuelve <code>True</code> si es par y <code>False</code>
     * si es impar.
     */
    public static boolean funcion_8(int a){
    	if(a%2 == 0) return true;
    	return false;
    }

    /**
     * Metodo que divide que toma dos enteros y los divide.
     */
    public static int funcion_9 (int a, int b) {
    	return a/b;
    }

	/**
     * Metodo que multiplica el valor <code>a</code> <code>b</code> y regresa su
     * productor
     */
    public static int funcion_10(int a, int b) {
    	return a*b;
    }
	
    public static void main (String [] args){  

    	imprimirResultados();    	
    }
    
    public static void imprimirResultados(){

    	char[] opt = {'a', 'b', 'c', 'd'};

    	//funcion_1
    	int[][] vecFuncion1 = {{1,2,3,4,5,6,7,8}, {9,10,23,46,134,46,789,1345,67,12},
    					{5,4,68,9,34,68,90,12,35,54}, {4,5,6,8,1,36,9,22,2,4}};
    	int[] tamFuncion1 = {7,9,9,9};

    	//funcion_2
    	int[] aFuncion2 = {48,15,120,30};
    	int[] bFuncion2 = {60,5,20,10};
    	
    	//funcion_3
    	int[] nFuncion3 = {48,60,-14,35};
    	
    	//funcion_4
    	int[] aFuncion4 = {445,6,23,33};
    	int[] bFuncion4 = {6,65,64,8};
    	
    	//funcion_5
    	int[] nFuncion5 = {5,10,4,8};
    	
    	//funcion_6
    	int[][] vecFuncion6 = {{1,2,3,4,5,6,7,8}, {9,10,23,46,134,46,789,1345,67,12},
    							{5,4,68,9,34,68,90,12,35,54}, {4,5,6,8,1,36,9,22,2,4}};
    	int[] tamFuncion6 = {7,9,9,9};

    	//funcion_7
    	int[] nFuncion7 = {1234,7654,9823,10743568};
    	
    	//funcion_8
    	int[] nFuncion8 = {45,66,234,33};
    	
    	//funcion_9
    	int[] aFuncion9 = {45,120,80,150};
    	int[] bFuncion9 = {3,6,12,3};

    	//funcion_10
    	int[] aFuncion10 = {128,124,810,30};
    	int[] bFuncion10 = {6,6,90,3};

    	for (int i = 0; i<10; i++) {
    		System.out.println("\nFuncion " + (i+1));
    		for (int j = 0; j<4; j++) {
    			
    			switch (i){
    				case 0:
						System.out.println(opt[j] + ") " + funcion_1(vecFuncion1[j],
										    	tamFuncion1[j]));
					break;

					case 1:
						System.out.println(opt[j] + ") " + funcion_2(aFuncion2[j],
												bFuncion2[j]));
					break; 

					case 2:
						System.out.println(opt[j] + ") " + funcion_3(nFuncion3[j]));
					break;

					case 3:
						System.out.println(opt[j] + ") " + funcion_4(aFuncion4[j],
												bFuncion4[j]));
					break;

					case 4:
						System.out.println(opt[j] + ") " + funcion_5(nFuncion5[j]));
					break;

					case 5:
						System.out.println(opt[j] + ") " + funcion_6(vecFuncion6[j],
												tamFuncion6[j]));
					break;

					case 6:
						System.out.println(opt[j] + ") " + funcion_7(nFuncion7[j]));
					break;

					case 7:
						System.out.println(opt[j] + ") " + funcion_8(nFuncion8[j]));
					break;

					case 8:
						System.out.println(opt[j] + ") " + funcion_9(aFuncion9[j],
												bFuncion9[j]));
					break;

					case 9:
						System.out.println(opt[j] + ") " + funcion_10(aFuncion10[j],
												bFuncion10[j]));
					break;   			
    			}
    		}
    	}
    }
    
}
