import java.util.Arrays;
/**
 * <p>Clase que muestra algoritmos de ordenameinto y de busqueda.</p>
 *
 * @author Angel Ivan Gladin G
 * @version 1.0
 * @date 02-nov-15.
 */
public class Arreglo{
	
	static int []a = {7,5,7,4,6,4,1,0};

    /**
     * Algoritmo Selection Sort
     * @param arr El arreglo a ordenar.
     */
    public static int[] selectionSort(int[] arr){
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
     * Algoritmo Quicksort
     * @param arr El arreglo a ordenar.
     */
    public static void quickSort(int[] arr, int low, int high) {
    	if (arr == null || arr.length == 0)
    		return;

    	if (low >= high)
    		return;

    	int mitad = low + (high - low) / 2;
    	int pivote = arr[mitad];

    	int i = low, j = high;
    	while (i <= j) {
    		while (arr[i] < pivote) {
    			i++;
    		}

    		while (arr[j] > pivote) {
    			j--;
    		}

    		if (i <= j) {
    			int temp = arr[i];
    			arr[i] = arr[j];
    			arr[j] = temp;
    			i++;
    			j--;
    		}
    	}

    	if (low < j)
    		quickSort(arr, low, j);

    	if (high > i)
    		quickSort(arr, i, high);
    }    
	//end quick sort
    //-----------


    /**
     * Metodo de ordenamiento MergeSort
     */
    public static void mergeSort(int[] array) {
    	if (array.length > 1) {

    		int[] left = mitadDerecha(array);
    		int[] right = mitadIzquierda(array);

    		merge(array, left, right);
    	}
    }

    public static int[] mitadDerecha(int[] array) {
    	int size1 = array.length / 2;
    	int[] left = new int[size1];
    	for (int i = 0; i < size1; i++) {
    		left[i] = array[i];
    	}
    	return left;
    }

    public static int[] mitadIzquierda(int[] array) {
    	int size1 = array.length / 2;
    	int size2 = array.length - size1;
    	int[] right = new int[size2];
    	for (int i = 0; i < size2; i++) {
    		right[i] = array[i + size1];
    	}
    	return right;
    }

    public static void merge(int[] result, int[] left, int[] right) {
        int i1 = 0;   // index into left array
        int i2 = 0;   // index into right array

        for (int i = 0; i < result.length; i++) {
        	if (i2 >= right.length || (i1 < left.length &&
        		left[i1] <= right[i2])) {
                result[i] = left[i1];    // take from left
            i1++;
        } else {
                result[i] = right[i2];   // take from right
                i2++;
            }
        }
    }


	/**
	 * Aloritmo de busqueda -> Busqueda lineal
	 * @param arr El arreglo en el cual se hara la busqueda
	 * @param elemento El elemento a buscar
	 */
	public static int busquedaLineal(int[] arr, int elemento){
		for (int i = 0; i<arr.length; i++) {
			if(arr[i] == elemento) return i;
		}
		return -1;
	}

    /**
     *
     * @param arr El arreglo en el cual se hara la busqueda
     * @param elemento El elemento a buscar
     */
    public static int busquedaBinaria(int[] arr, int elemento){
        //Ordenar el arreglo
        //arr = mergeSort(arr);

    	int firstPos = 0;
    	int lastPos = arr.length - 1;
    	int midPos;

    	while(firstPos <= lastPos){
    		midPos = (lastPos + firstPos)/2;
    		if(elemento == arr[midPos]){
    			return midPos;
    		}else if(elemento < arr[midPos]){
            	//Si el elemento a buscar es menor que el elemento en medio del
            	//arreglo entonces la posicionFinal sera la posicion de en medio
            	//menos 1, para asi solo buscar en los elementos menores de la
            	//posicion de enmedio del arreglo
    			lastPos = midPos - 1;
    		}else if(elemento >= arr[midPos]){
            	//Emepezar a buscar el los elementos mayores o iguales de la
            	//posicion de en medio del arreglo
    			firstPos = midPos +1;
    		}
    	}

    	return -1;
    }
    public static void main(String[] args) {
    	int[] b = {1,2,3,4,5,6};
    	int[] c = {1,6,9,11,56,90};
    	
    	System.out.println("---Busquedas---");
    	System.out.println("Busqueda lineal del numero 4 en -> " + Arrays.toString(b));
    	System.out.println("Esta en la posicion [" + busquedaLineal(b, 4) + "]");

    	System.out.println("Busqueda binaria del numero 11 en -> " + Arrays.toString(c));
    	System.out.println("Esta en la posicion [" + busquedaLineal(c, 90) + "]");
    	
    	int[] x = {9,2,4,2,9999,0,6,8,1};
    	int[] y = {2,3,4,9,8,7};
    	int[] w = {999,1,7,3,6,7,9};

    	System.out.println("\n---Ordenamientos---");
    	System.out.println("Selction Sort: arreglo -> " + Arrays.toString(x));
    	System.out.println("Arreglo ordenado -> " + Arrays.toString(selectionSort(x)));

    	System.out.println("Merge Sort: arreglo -> " + Arrays.toString(y));
    	mergeSort(y);
    	System.out.println("Arreglo ordenado -> " + Arrays.toString(y));
    	
    	System.out.println("Quicksort Sort: arreglo -> " + Arrays.toString(w));
    	quickSort(w, 0, w.length-1);
    	System.out.println("Arreglo ordenado -> " + Arrays.toString(w));
    }


}