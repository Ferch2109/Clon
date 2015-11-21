public class Masajista extends SeleccionDeFutbol {

    private int aniosExp;
    private int numCedula;

    public Masajista(int numID, int edad, String nombre, String apellido, int aniosExp, int numCedula) {
        super(numID, edad, nombre, apellido);
        this.aniosExp = aniosExp;
        this.numCedula = numCedula;
    }

    public boolean tomarCurso() {
        return true;
    }

    @Override public String viajar() {
        return "Viaja en tercera clase";
    }

    @Override public String concentrarse() {
        return "Se consentra dar un buen masaje";
    }

    @Override public String presentesEnPartido() {
        return "No esta en elpartido";
    }

    @Override public String toString() {
        return "Masajista{" +
                "Numero de identificador: " + getNumID() +
                ", Nombre: " + getNombre() +
                ", Apellidos: " + getApellido() +
                ", Edad: " + getEdad() +
                ", Años de experiencias: " + aniosExp +
                ", Numero de cedula profecional: " + numCedula +
                ", toma cursos: " + tomarCurso() +
                ", viaja: " + viajar() +
                ", como se concentran: " + concentrarse() +
                ", como estran presentes en el partido: " + presentesEnPartido() +
                '}';
    }

}