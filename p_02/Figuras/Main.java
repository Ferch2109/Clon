/**
 * Programa para mostrar metodo toString()
 *
 * @author  Angel Gladin
 * @version 1.0
 *
 * ICC
 */

public class Main{
	public static void main(String[] args) {

		//Cree objetos anonimos por que solo
		//seran usados una vez
		System.out.println(new Circulo(2.0, "rojo").toString());
		System.out.println(new Cuadrado(4.0 , "verde").toString());
		System.out.println(new Cilindro(2.0, 4.0, "morado").toString());
	}
}