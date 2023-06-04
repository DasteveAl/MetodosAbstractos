package CarreraCiclistica;
import java.util.*;
public class Equipo {
    private String nombre;
    private static double total_tiempo;
    private String pais;
    Vector lista_ciclistas;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        total_tiempo = 0;
        lista_ciclistas = new Vector();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre() {
        this.nombre = nombre;
    }
    private String getPais() {
        return pais;
    }
    private void setPais() {
        this.pais = pais;
    }
    void anadirCiclista(CarreraCiclistica.Ciclista ciclista) {
        lista_ciclistas.add(ciclista);
    }
    void listarEquipo() {
        for (int i = 0; i < lista_ciclistas.size(); i++) {
            CarreraCiclistica.Ciclista c = (CarreraCiclistica.Ciclista) lista_ciclistas.elementAt(i);
            System.out.println(c.getNombre());
        }
    }
    void buscarCiclista() {
        Scanner sc = new Scanner(System.in);
        String nombreCiclista = sc.next();
        for (int i = 0; i < lista_ciclistas.size(); i++) {
            CarreraCiclistica.Ciclista c = (CarreraCiclistica.Ciclista) lista_ciclistas.elementAt(i);
            if (c.getNombre().equals(nombreCiclista)) {
                System.out.println(c.getNombre());
            }
        }
    }
    void calcularTotalTiempo() {
        for (int i = 0; i < lista_ciclistas.size(); i++) {
            CarreraCiclistica.Ciclista c = (CarreraCiclistica.Ciclista) lista_ciclistas.elementAt(i);
            total_tiempo = total_tiempo + c.getTiempoAcumulado();
        }
    }
    void imprimir() {
        System.out.println("Nombre del equipo = " + nombre);
        System.out.println("Pais = " + pais);
        System.out.println("Total tiempo del equipo = " + total_tiempo);
    }
}
