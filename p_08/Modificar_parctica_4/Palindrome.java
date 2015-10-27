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

	public static void main(String[] args){
		try{
			System.out.println(palindrome(""));
		}catch(CadenaVaciaException e){
			System.out.println(e.getMessage());
		}
	}

	/**
	* Metodo que me <code>true</code> si es palindrome
	* y <code>false</code> si no es palindrome.
	* Devuelve una excepsion si la cadena dada esta vacia.
	*
	* @param String para verificar
	*/
	public static boolean palindrome(String str) throws CadenaVaciaException{
		if(str.length() == 0) throw new CadenaVaciaException("No puede haber una cadena vacia.");
		
		if(str.length() == 1){
			return true;
		}
		return (str.charAt(0) == str.charAt(str.length()-1)) && palindrome(str.substring(1,str.length()-1));

	}

}

