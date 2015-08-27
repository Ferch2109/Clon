/**
 * @author  Angel Gladin
 * @version 1.0
 *
 * ICC
 */
public class Cilindro{

    public static final double PI = 3.1416;
	
	private double radio;
    private double altura;
    private String color;

    public Cilindro(){}

    public Cilindro(double radio, double altura, String color) {
        this.radio = radio;
        this.color = color;
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public double getArea(){
    	return 2 * (PI * radio) * (altura + radio);
    }

    public double getAltura(){
    	return altura;
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

    public void setAltura(double altura){
    	this.altura = altura;
    }

    public double getVolumen(){
		return PI * (Math.pow(radio, 2) * altura);
	}

    @Override
    public String toString(){
    	return "El Cilindro su radio es de " + radio 
    		+ ", su altura es de " + altura + ", su color es "
    		+ color + " su volumen es "+ getVolumen()
    		+ " y su area de es "+ getArea();
    }
    
}