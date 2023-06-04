package CarreraCiclistica;
public class Contrarrelojista extends CarreraCiclistica.Ciclista {
    private double velocidad_maxima;

    public Contrarrelojista(int identificador, String nombre,
                           double velocidad_maxima) {
        super(identificador, nombre);
        this.velocidad_maxima = velocidad_maxima;
    }
    protected double getVelocidadMaxima() {
        return velocidad_maxima;
    }
    protected void setVelocidadMaxima(double velocidad_maxima) {
        this.velocidad_maxima = velocidad_maxima;
    }
    protected void imprimir() {
        super.imprimir();
        System.out.println("Aceleracion promedio = " + velocidad_maxima);
    }
    protected String imprimirTipo() {
        return "Es un contrarrelojista";
    }
}
