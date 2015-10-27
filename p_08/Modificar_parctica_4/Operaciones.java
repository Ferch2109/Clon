public class Operaciones{
	
	public Operaciones(){}

	public double sumar(double a, double b){
		return a + b;
	}

	public double restar(double a, double b){
		return a - b;
	}

	public double multiplicar(double a, double b){
		return a * b;
	}

	public double dividir(double a, double b){
		return a / b;
	}

	public double factorial(int a){
		int resultado = 1;
		while(a > 0){
		    resultado = resultado * a;
		    a--;
		}
		return resultado;
	}
}