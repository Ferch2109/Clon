/**
 * Programa que imprimie un rombo dado el alto de uno de sus
 * lados -1.
 *
 * @author Angel Ivan Gladin G
 * @version 1.0
 * @date 18-sep-15.
 **/
public class Rombo{
	public static void main(String[] args) {
		
		printRhombus(4, '*');
	}//end main

	/**
	*Metodo que dibuja un rombo
	*/
	public static void printRhombus(int height, char chr){
		int realHeight= (height*2)+1;
		int aux=0;
		int aux3 = height;	
		int aux4 = height-1;				

		for (int i = 1; i<=realHeight; i++) {
			
			if(aux == height){
				for (int n = 0; n<realHeight ; n++) {
					System.out.print(chr);
				}
				aux=0;
			}
			else{
				if(i <= height){
					aux3--;
					for (int j=aux3; j>=0; j--) {
						System.out.print(" ");
					}
					for (int j=2; j<=(aux*2)+2; j++) {
						System.out.print(chr);
					}
					aux++;
				}
				else{
					for (int j=aux3; j>=0; j--) {
						System.out.print(" ");
					}
					aux3++;
					for (int j=2; j<=(aux4*2)+2; j++) {
						System.out.print(chr);
					}
					aux4--;
				}
			}
			System.out.println("");
		
		}
	}//end method
}