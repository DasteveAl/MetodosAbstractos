package CarreraCiclistica;
public abstract class Ciclista {
    private int identificador;
    private String nombre;
    private int tiempo_acumulado;

    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }
    abstract String imprimirTipo();
    protected int getIdentificador() {
        return identificador;
    }
    protected void setIdentificador() {
        this.identificador = identificador;
    }
    protected String getNombre() {
        return nombre;
    }
    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }
    protected int getPosicionGeneral(int posicion_general) {
        return posicion_general;
    }
    protected void setPosicionGeneral(int posicion_general) {
        posicion_general = posicion_general;
    }
    protected int getTiempoAcumulado() {
        return tiempo_acumulado;
    }
    protected void setTiempoAcumulado(int tiempo_acumulado) {
        this.tiempo_acumulado = tiempo_acumulado;
    }
    protected void imprimir() {
        System.out.println("Identificador = " + identificador);
        System.out.println("Nombre = " + nombre);
        System.out.println("Tiempo Acumulado = " + tiempo_acumulado);
    }
}
