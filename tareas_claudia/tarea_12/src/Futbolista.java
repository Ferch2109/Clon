public class Futbolista extends SeleccionDeFutbol {

    private int numCamiseta;
    private int demarcasiones;

    public Futbolista(int numID, int edad, String nombre, String apellido, int numCamiseta, int demarcasiones) {
        super(numID, edad, nombre, apellido);
        this.numCamiseta = numCamiseta;
        this.demarcasiones = demarcasiones;
    }

    public String entrenar() {
        return "Entrenar corriendo";
    }

    public String formaDarEntrevistas() {
        return "De buena manera";
    }

    @Override public String viajar() {
        return "Viajan en avion de primera clase";
    }

    @Override public String concentrarse() {
        return "No se concentran solo juagan";
    }

    @Override public String presentesEnPartido() {
        return "Corren persiguiendo una pelota";
    }

    @Override public String toString() {
        return "Futbolista{" +
                "Numero de identificador: " + getNumID() +
                ", Nombre: " + getNombre() +
                ", Apellidos: " + getApellido() +
                ", Edad: " + getEdad() +
                ", Numero de camiseta: " + numCamiseta +
                ", demarcaciones: " + demarcasiones +
                ", da las entrevidas: " + formaDarEntrevistas() +
                ", viaja: " + viajar() +
                ", como se concentran: " + concentrarse() +
                ", como estran presentes en el partido: " + presentesEnPartido() +
        '}';
    }

    public int getNumCamiseta() {
        return numCamiseta;
    }

    public void setNumCamiseta(int numCamiseta) {
        this.numCamiseta = numCamiseta;
    }

    public int getDemarcasiones() {
        return demarcasiones;
    }

    public void setDemarcasiones(int demarcasiones) {
        this.demarcasiones = demarcasiones;
    }
}