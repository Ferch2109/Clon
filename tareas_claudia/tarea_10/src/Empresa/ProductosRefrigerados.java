/**
 * Clase abstracta que hereda de Productos ya que comparten casi todo
 * de productos y fue mejor usar la herencia para reutilizar codigo.
 * Se utulizara la palabra super para indicar que estamos llamando al constructor base.
 */
public abstract class ProductosRefrigerados extends Productos {

    private String codigoOrganismoSupAlimentaria;
    private int fechaDeEnvasado;
    private int temperaturaRecomendada;
    private String paisDeOrigen;

    public ProductosRefrigerados(int fechaCaducidad, int numeroDeLote,
                                 String codigoOrganismoSupAlimentaria, int fechaDeEnvasado,
                                 int temperaturaRecomendada, String paisDeOrigen) {
        super(fechaCaducidad, numeroDeLote);
        this.codigoOrganismoSupAlimentaria = codigoOrganismoSupAlimentaria;
        this.fechaDeEnvasado = fechaDeEnvasado;
        this.temperaturaRecomendada = temperaturaRecomendada;
        this.paisDeOrigen = paisDeOrigen;
    }

    public ProductosRefrigerados(int fechaCaducidad, int numeroDeLote, int fechaDeEnvasado,
                                 String paisDeOrigen, int temperaturaRecomendada) {
        super(fechaCaducidad, numeroDeLote);
        this.fechaDeEnvasado = fechaDeEnvasado;
        this.temperaturaRecomendada = temperaturaRecomendada;
        this.paisDeOrigen = paisDeOrigen;
    }

    public String getCodigoOrganismoSupAlimentaria() {
        return codigoOrganismoSupAlimentaria;
    }

    public void setCodigoOrganismoSupAlimentaria(String codigoOrganismoSupAlimentaria) {
        this.codigoOrganismoSupAlimentaria = codigoOrganismoSupAlimentaria;
    }

    public int getFechaDeEnvasado() {
        return fechaDeEnvasado;
    }

    public void setFechaDeEnvasado(int fechaDeEnvasado) {
        this.fechaDeEnvasado = fechaDeEnvasado;
    }

    public int getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(int temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }
}