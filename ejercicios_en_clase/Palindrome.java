/**
* ICC
*
* @author Angel Ivan Gladin Gracia
* @version 1.0
* @date 31-sep-2015 
*
* Programa que te dice si es un palindrome.
* 
*/
public class Palindrome{

	public static void main(String[] args) {
			System.out.println(palindrome("reconocer"));
	}

	/**
	* Metodo que me <code>true</code> si es palindrome
	* y <code>false</code> si no es palindrome.
	* Devuelve una excepsion si la cadena dada esta vacia.
	*
	* @param String para verificar
	*/
	public static boolean palindrome(String str){
		try{
			if(str.length() == 1){
				return true;
			}
			return (str.charAt(0) == str.charAt(str.length()-1)) && palindrome(str.substring(1,str.length()-1));

		}catch(Exception e){
			throw new IllegalArgumentException("No puedes poner una cadena vacia");
		}
	}

}

