import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Incidente {

    private  Cliente cliente;
    private Servicio servicio;
    private List<Problema> problemas;
    private Tecnico tecnico;
    private EstadoIncidente estado;
    private Date fechaIngreso;
    private Date fechaResolucion;
    private int tiempoEstimado;

    public Incidente(Cliente cliente, Servicio servicio, List<Problema> problemas, Tecnico tecnico, EstadoIncidente estado, Date fechaIngreso, Date fechaResolucion, int tiempoEstimado) {
        this.cliente = cliente;
        this.servicio = servicio;
        this.problemas = problemas;
        this.tecnico = tecnico;
        this.estado = estado;
        this.fechaIngreso = fechaIngreso;
        this.fechaResolucion = fechaResolucion;
        this.tiempoEstimado = tiempoEstimado;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Servicio getServicio() {
        return servicio;
    }
    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    public List<Problema> getProblemas() {
        return problemas;
    }
    public void setProblemas(List<Problema> problemas) {
        this.problemas = problemas;
    }
    public Tecnico getTecnico() {
        return tecnico;
    }
    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
    public EstadoIncidente getEstado() {
        return estado;
    }
    public void setEstado(EstadoIncidente estado) {
        this.estado = estado;
    }
    public Date getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public Date getFechaResolucion() {
        return fechaResolucion;
    }

    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public void setFechaResolucion(Date fechaResolucion) {
        this.fechaResolucion = fechaResolucion;


}


public String marcarResuelto(){ return "";
    }
    public int asignarColchonHoras(){
        return 1;
    }
    public String registroDelIncidente(){
        return "";
    }
    public String comentarioResolverIncidente(Incidente Incidente) {
        return "";
    }
        public String notificacionInceidente (Incidente Incidente){
            return "";
    }

}