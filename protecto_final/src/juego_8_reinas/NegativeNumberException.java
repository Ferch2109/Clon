/**
 * <p>Clase para crear una excepción propia que servirá para cuando
 * el usuario de un numero negativo.</p>
 *
 * @author Angel Ivan Gladin Garcia
 * @date 31-11-15
 * @version 1.0
 */
public class NegativeNumberException extends Exception {

	public NegativeNumberException(String message) {
		super(message);
	}

}