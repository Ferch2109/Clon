public class Calculos{
	
	public static final double PI = Math.PI;

	public static final int RADIO = 25;
	public static final double ALTURA = 57.23;

	public static void main(String[] args) {
		areaCuadrado_1();
		areaCuadrado_2(2);
		areaTriangulo_1();
		System.out.println(areaTriangulo_2());
		area_cilindro();
		volumen_cilindro();
	}

	public static void areaCuadrado_1(){
		final int lado = 9;
		int resultado = lado*lado;
		System.out.println(resultado);
	}

	public static void areaCuadrado_2(int lado){
		int resultado = lado*lado;
		System.out.println(resultado);
	}

	public static void areaTriangulo_1(){
		final double base = 3.0;
		final double altura = 5.0;
		double resultado = (base*altura)/2;
		System.out.println(resultado);
	}

	public static double areaTriangulo_2(){
		final double base = 3.0;
		final double altura = 5.0;
		double resultado = (base*altura)/2;	
		return resultado;
	}

	public static void area_cilindro(){
		double areaCilindro = 2 * (PI * RADIO) * (ALTURA + RADIO);
		System.out.println(areaCilindro);
	}


	public static void volumen_cilindro(){
		double volumenCilindro = PI * (Math.pow(RADIO, 2) * ALTURA);
		System.out.println(volumenCilindro);
	}
}