/**
 * @author  Angel Gladin
 * @version 1.0
 *
 * ICC
 */
public class Cuadrado{

	private double lado;
    private String color;

    public Cuadrado(){}

    public Cuadrado(double lado, String color) {
        this.lado = lado;
        this.color = color;
    }

    public double getArea(){
    	return lado*lado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLado() {
       return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString(){
    	return "El cuadrado su lado es de " + lado 
    		+ ", su area es de " + getArea() + " y su color es "
    		+ color;
    }
    
}