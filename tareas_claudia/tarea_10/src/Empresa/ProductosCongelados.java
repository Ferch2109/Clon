/**
 * Clase abstracta que hereda de Productos congelados ya que comparten casi todo
 * de productos refrigerados y fue mejor usar la herencia para reutilizar codigo.
 */
public abstract class ProductosCongelados extends ProductosRefrigerados{
	
	public ProductosCongelados(int fechaCaducidad, int numeroDeLote, int fechaDeEnvasado,
										String paisDeOrigen, int temperaturaRecomendada){
		super(fechaCaducidad, numeroDeLote, fechaDeEnvasado, paisDeOrigen, temperaturaRecomendada);
	}

}