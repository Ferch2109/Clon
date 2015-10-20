import java.util.Scanner;

public class Practica4 {

	public static boolean isNumeric(String str){  
		try{
	    	double d = Double.parseDouble(str);  
	  	} catch(NumberFormatException nfe){  
	    	return false;  
	  	}  
	  	return true;  
	}


    public static void main(String[]args) {
		Scanner in= new Scanner(System.in);

		Operaciones op = new Operaciones();
		Palindrome palindromo = new Palindrome();
		String opcion;
		double numero1, numero2;
		String oracion;

		System.out.println("¡Bienvenido a la práctica 4 de ICC!");
		do {
			opcion = " ";
			System.out.println("Por favor, selecciona el número de una de las siguientes opciones:\n1) Suma\n2) Resta\n3) Multiplicación\n4) Division\n5) Factorial\n6) Verificador de Palindromos\n7) Créditos\n8) Salir");
		    while(!(isNumeric(opcion.substring(0, 1)))){
				System.out.print("Opcion: ");
		    	opcion=in.nextLine();

		    	if(!(isNumeric(opcion.substring(0, 1)))){
		    		System.out.println("Opcion no valida");
		    	}
		    }

	    	if(Integer.parseInt(opcion.substring(0, 1)) > 0 && Integer.parseInt(opcion.substring(0, 1)) < 5){
	    		System.out.print("Primer numero: ");
				numero1 = in.nextDouble();
				System.out.print("Segundo numero: ");
				numero2 = in.nextDouble();
				in.nextLine();
	    		switch(opcion.charAt(0)) {
			    	case '1':
						System.out.println("Suma: " + op.sumar(numero1, numero2));
						break;
			    	case '2':
						System.out.println("Resta: " + op.restar(numero1, numero2));
						break;
			    	case '3':
						System.out.println("Multiplicacion: " + op.multiplicar(numero1, numero2));
						break;
			    	case '4':
			    		if(numero2 != 0){
			    			System.out.println("Division: " + op.dividir(numero1, numero2));
			    		} else {
			    			System.out.println("Division no valida");
			    		}
				}

	    	} else {
	    		switch(opcion.charAt(0)) {
			    	case '5':
				    	System.out.print("Numero: ");
						numero1 = in.nextDouble();
						in.nextLine();
						System.out.println("Division: " + op.factorial((int)numero1));
						break;
			    	case '6':
			    		System.out.print("Oracion: ");
						oracion = in.nextLine();
						if(palindromo.palindrome(oracion.replace(" ", ""))){
							System.out.println("Es Palindromo");
						} else {
							System.out.println("No es Palindromo");
						}
						break;
			    	case '7':
				    	System.out.println("Elaborado por Angel, Eder, Fernando y Joshua.");
						break;
			    	case '8':
				    	break;
				    default:
				    	System.out.println("Opcion no valida.");
				}
	    	}
	    	System.out.println("");
		}while(opcion.charAt(0) != '8');

		System.out.println("Hasta luego.");

    }


}
