/**
 * Created by angel on 26/09/15.
 */
public class ArregloDecimales {

    public static final int TAMANIO = 50;

    double []arr = new double[TAMANIO];
    int []pos = {9, 6, 50};
    int c = 0;

    public ArregloDecimales(){
        inicializar();
        asigna();
    }

    private void inicializar(){
        for (int i = 0; i < TAMANIO; i++) {
            arr[i] = 0;
        }
    }

    private void asigna(){
        for (int i = 0; i < TAMANIO; i++) {
            if(i == pos[0]-1){arr[i] = 1.6;}
            else if(i == pos[1]-1){arr[i] = 3.333;}
            else if(i == pos[2]-1){arr[i] = 4.5;}
            else{arr[i] = 2.5;}

        }
    }
    
    public double mostrarSuma(){
        double aux = 0;
        for (double i : arr){aux += i;}
        return aux;
    }

    public static void main(String a[]){
        System.out.println(new ArregloDecimales().mostrarSuma());
    }

}
