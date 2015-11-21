public class Entrenador extends SeleccionDeFutbol{

    private String numIdFed;

    public Entrenador(int numID, int edad, String nombre, String apellido, String numIdFed) {
        super(numID, edad, nombre, apellido);
        if(numIdFed.length() != 13){
            throw new IllegalArgumentException("La longitud del id no es valida.");
        }
        this.numIdFed = numIdFed;
    }

    public String planificarEstrategia() {
        return "La planifica muy bien";
    }
    public String planificarEntrenamientos() {
        return "Es el mejor planificando entrenamientos";
    }
    
    @Override public String viajar() {
        return "Viaja en segunda clase";
    }

    @Override public String concentrarse() {
        return "Se consentra un buen para ganar";
    }

    @Override public String presentesEnPartido() {
        return "Esta en las bancas";
    }

    @Override public String toString() {
        return "Entrenador{" +
                "Numero de identificador: " + getNumID() +
                ", Nombre: " + getNombre() +
                ", Apellidos: " + getApellido() +
                ", Edad: " + getEdad() +
                ", Numero de identificacion ante federacino de futbol: " + numIdFed +
                ", planifica entrtenamientos: " + planificarEntrenamientos() +
                ", da las planifica estrategias: " + planificarEstrategia() +
                ", viaja: " + viajar() +
                ", como se concentran: " + concentrarse() +
                ", como estran presentes en el partido: " + presentesEnPartido() +
                '}';
    }

}