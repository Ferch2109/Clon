import java.util.*;

public class Moneda{
	
	String eleccion;
	String usuario;

	public Moneda(String usuario){
		this.usuario = usuario;
	}

	public String lanzar(){
		double random = Math.random()*2;
		if (random > 1){
			return "s";
		}else{
			return "a";
		}
	}//end lanzar

	public static void main(String[] args) {
		String nombre, eleccion;
		Scanner in = new Scanner(System.in);

		System.out.println("Dame tu nombre");
		nombre = in.nextLine();
		
		do{
			System.out.println("Que escojes, aguila o sol? [a/s]");
			eleccion = in.nextLine();
		}while(!(eleccion.equals("a") || eleccion.equals("s")));

		Moneda moneda = new Moneda(nombre);

		if(eleccion.equals(moneda.lanzar())){
			System.out.println(nombre + " ganaste");
		}else{
			System.out.println(nombre + " perdiste");
		}
	}//fin metodo main


}