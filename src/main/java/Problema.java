import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

public class Problema {

    private String descripcion;
    private String tipoProblema; //es clase enum
    private List<Especialidad> especialidades;
    private String tiempoResolucion;


    public Problema(String descripcion, String tipoProblema, List<Especialidad> especialidades, String tiempoResolucion) {
        this.descripcion = descripcion;
        this.tipoProblema = tipoProblema;
        this.especialidades = especialidades;
        this.tiempoResolucion = tiempoResolucion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public String getTiempoResolucion() {
        return tiempoResolucion;
    }

}
