import java.util.Scanner;

public class Bases{

	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);

	String[] valores  = {"1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};

	System.out.println("Ingresa tu numero\n octal a hex");
	
	int numeroOctal = in.nextInt();
	int longitudNumOctal = Integer.toString(numeroOctal).length();

	String numero = String.valueOf(numeroOctal);
	
	String[] res = new String [longitudNumOctal];
	int[] numDesc = new int [longitudNumOctal];

	for (int i = 0 ; i< longitudNumOctal ; i++) {
		numDesc[i] = Character.getNumericValue(numero.charAt(i));
		res[i] = String.valueOf(pasarABinario(numDesc[i]));	
		if(res[i].length() == 1){
			res[i] = 00 + res[i];
		}else if (res[i].length() == 2) {
			res[i] = 0 + res[i];
		}
	}


	System.out.println(res[0]+" "+res[1]+" "+res[2]+" ");
	//Pasarlos de intervalos de 4 en 4
	
	String binario = String.valueOf(res[0]+res[1]+res[2]);


	System.out.println("Numero en hexadeciaml es :  "+Integer.toHexString(Integer.parseInt(String.valueOf(numeroOctal), 8)));
		


}

	public static int binarioADecimal(String numeroBinario){
	int longitud = numeroBinario.length();
    int resultado = 0;
    int potencia = longitud - 1;
    
    for(int i = 0;i < longitud;i++){
    	if(numeroBinario.charAt(i) == '1'){
    		resultado += Math.pow(2,potencia);
    	}
    	potencia --;
    }
 	
 	return resultado;
	}

	public static int pasarABinario(int param){
		int num = param;
		String aux = "";
		while(num != 0){
			if(num % 2 == 0){
				aux = 0 + aux; 
			}else{
				aux = 1 + aux; 				
			}
			num/=2;
		}
		return Integer.parseInt(aux);

	}

}