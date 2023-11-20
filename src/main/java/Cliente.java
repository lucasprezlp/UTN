import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String razonSocial;
    private int cuit;
    private List<Servicio> serviciosContratados = new ArrayList<Servicio>();



    public Cliente(String razonSocial, int cuit, List<Servicio> serviciosContratados) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.serviciosContratados = serviciosContratados;
    }



    public String getRazonSocial() {
        return razonSocial;
    }

    public int getCuit() {
        return cuit;
    }




    public void agregarServicios(Servicio servicios) {

        this.serviciosContratados.add(servicios);
    }

    public List<Servicio> mostrarServiciosContratados() {

        return serviciosContratados;
    }




}
