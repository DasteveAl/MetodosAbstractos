package CarreraCiclistica;
public class Velocista extends CarreraCiclistica.Ciclista {
    private double potencia_promedio;
    private double velocidad_promedio;
    public Velocista(int identificador, String nombre, double potencia_promedio,
                     double velocidad_promedio) {
        super(identificador, nombre);
        potencia_promedio = potencia_promedio;
        this.velocidad_promedio = velocidad_promedio;
    }
    protected double getPotenciaPromedio() {
        return potencia_promedio;
    }
    protected double getVelocidadPromedio() {
        return velocidad_promedio;
    }
    protected void setVelocidadPromedio(double velocidad_promedio) {
        this.velocidad_promedio = velocidad_promedio;
    }
    protected void imprimir() {
        super.imprimir();
        System.out.println("Potencia promedio = " + potencia_promedio);
        System.out.println("Velocidad promedio = " + velocidad_promedio);
    }
    protected String imprimirTipo() {
        return "Es un velocista";
    }
}
