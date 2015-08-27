/**
 * @author  Angel Gladin
 * @version 1.0
 *
 * ICC
 */
public class Circulo{

    public static final double PI = 3.1416;
	
	private double radio;
    private String color;

    public Circulo(){}

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public double getArea(){
    	return PI * Math.pow(this.radio, 2);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString(){
    	return "El circulo su radio es de " + radio 
    		+ ", su area es de " + getArea() + " y su color es "
    		+ color;
    }
    
}