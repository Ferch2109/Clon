/**
 * Clase que simula el comportamiento de un robot
 *
 * @author Angel Ivan Gladin G
 * @version 1.0
 * @date 05-ago-15.
 */
public class Robot {

    private String nombre;
    private String marca;
    private String numSerie;
    private boolean estaDormido;

    /**
     * Constructor por omision. Crea a Robotina, de la marca Hasbro,
     * con numero de serie Rob2011
     */
    public Robot () {
        this("Robotina", "Hasbro", "Rob2011");
    }

    /**
     * Constructor de un robot a partir de su nombre, marca y número de serie
     * @param n - nombre del robot
     * @param m - marca del robot
     * @param num - número de serie del robot
     */
    public Robot (String n, String m, String num) {
        this.nombre = n;
        this.marca = m;
        this.numSerie = num;
    }

    /**
     * Método para asignar nombre al robot
     * @param nomb -- cadena con el nombre del robot
     */
    public void asignarNombre(String nomb) {
        this.nombre = nomb;
    }

    /**
     * Método para asignar marca al robot
     * @param marca -- cadena con la marca del robot
     */
    public void asignarMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método para asignar numSerie al robot
     * @param num -- cadena con el numero de serie del robot
     */
    public void asignarNumSerie(String num) {
        this.numSerie = num;
    }

    /**
     * Método para obtener el nombre del robot
     * @return String -  nombre del robot
     */
    public String obtenerNombre() {
        return nombre;
    }
    /**
     * Método para obtener la marca del robot
     * @return String -  marca del robot
     */
    public String obtenerMarca() {
        return marca;
    }

    /**
     * Método para obtener el número de Serie del robot
     * @return String -  número de serie del robot
     */
    public String obtenerNumSerie() {
        return numSerie;
    }

    /** 
     * Método para hacer dormir al robot
     */
    public void dormir() {
        estaDormido = true;
    }

    /** 
     * Método para despertar al robot
     */
    public void despertar() {
        estaDormido = false;
    }

    /**
     * Método para saber si el robot está despierto
     * @return boolean -- Si es true el robot está despierto y false si esta dormindo
     */
    public boolean estaDespierto() {
        return estaDormido;
    }

    /**
     * Método para que el robot repita lo que se le dice
     * @param rollo -- cadena con el rollo que se desea repita el robot
     */
    public void repetir(String rollo) {
        System.out.println(rollo);
    }

    /**
     * Método para determinar si dos robots son iguales
     * @param robot -- robot con el que se va a comparar
     * @return boolean -- true si son iguales y false en otro caso.
     */
    public boolean equals (Robot robot) {
        return this.equals(robot);
    }

    /**
     * Método para devolver una cadaena con el nombre del robot.
     * @return String -- cadena que devolvera
     */
    @Override public String toString () {
        return obtenerNombre();
    }

    /**
     * Método para que el robot reste los números que se le dan
     * @param num1 -- minuendo
     * @param num2 -- sustraendo
     */
    public void restar(long num1, long num2) {
        System.out.println(num1 - num2);
    }

    /**
     * Método para que el robot sume los números que se le dan
     * @param num1 -- primer sumando
     * @param num2 -- segundo sumando
     */
    public void sumar(long num1, long num2) {
        System.out.println(num1 + num2);
    }

    /**
     * Método para que el robot multiplique los números que se le dan
     * @param num1 -- primer factor
     * @param num2 -- segundo factor
     */
    public void multiplicar(long num1, long num2) {
        System.out.println(num1 * num2);
    }

    /**
     * Método para que el robot divida los números que se le dan
     * @param num1 -- dividendo
     * @param num2 -- divisor
     */
    public void dividir(long num1, long num2) {
        System.out.println(num1 / num2);
    }

}