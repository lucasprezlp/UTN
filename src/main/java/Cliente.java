import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String razonSocial;
    private int cuit;
    private List<Servicios> serviciosContratados = new ArrayList<Servicios>();

    public String getRazonSocial() {
        return razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public void agregarServicios(Servicios servicios) {
        this.serviciosContratados.add(servicios);
    }

    public List<Servicios> mostrarServiciosContratados() {
        return serviciosContratados;
    }
}
