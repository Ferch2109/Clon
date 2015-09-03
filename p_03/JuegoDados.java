import java.util.*;

/**
 * Programa para simular el juego de dados entre la persona y la computadora
 * Se tiran dos veces los dados por participante y el resultado de los dados se multiplica
 * El ganador es aquel con el resultado mayor
 * 
 * @author Angel Ivan Gladin G
 * @version 1.0
 * @date 05-ago-15.
 **/
public class JuegoDados{

	//Numero minimo y maximo de dados.
	static final int max = 6;
    static final int min = 1;

    public static void main(String[] args){

        String tirarDado;
        String nombre;

        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        nombre = in.nextLine();

        do{
        	System.out.print("Aprieta la tecla <Enter> ");
        	 tirarDado = in.nextLine();
        }while( !(tirarDado.equals("")) );

        do{
        	System.out.print("Vuelve a tirar <Enter>");
            tirarDado = in.nextLine();
        }while( !(tirarDado.equals("")) );
               
        //Le paso argumentos con objetos anonimos
        determinarGanador(new Dado(nombre, numeroAzar(), numeroAzar()),
        	new Dado("computadora", numeroAzar(), numeroAzar()) );

    }

    
	/**
     * Determina quien gano
     * @param dadoHumano Pide objeto de tipo <code>Dado</code>
     * @param dadoRobot Pide objeto de tipo <code>Dado</code>
     */
    private static void determinarGanador(Dado dadoHumano, Dado dadoRobot) {
        if(dadoHumano.obtenerPuntuacion() > dadoRobot.obtenerPuntuacion()){
            System.out.println(dadoHumano.toString());
        }else{
            System.out.println(dadoRobot.toString());
        }
    }
    
    /**
     *
     * @return Regresa un numero al azar en un intervalo definido.
     */
    public static int numeroAzar(){
        Random random = new Random();
        return random.nextInt((max- min) +1 ) + min;
    }

	    /**
	     * Creacion clase anonima <code>Dado</code> que sirven para simular
	     * el lanzado de un dado
	     */
	    public static class Dado{

	        private int val1;
	        private int val2;
	        private String nomUsr;

	        /**
	         * Constructor de la clase.
	         * @param nomUsr Nos pide el nombre del usuario
	         * @param val1 El primer valor del dado.
	         * @param val2 El segundo valor del dado.
	         */
	        public Dado(String nomUsr,int val1, int val2){
	            this.val1 = val1;
	            this.val2 = val2;
	            this.nomUsr = nomUsr;
	        }

	        public String getNomUsr(){
	            return nomUsr;
	        }

	        /**
	         * @return Un string con todas las caracteristicas de objeto creado.
	         */
	        @Override public String toString(){
	            return "Gano " + getNomUsr()+ " y sus dados fueron "
	                    + val1 + " y " + val2 + ", combinados son: " + obtenerPuntuacion();
	        }

	        /**
	         * @return Nos regresa los valores multiplicados.
	         */
	        public int obtenerPuntuacion(){
	            return val1*val2;
	        }
	    }//acaba clase Dado


}
