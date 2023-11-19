import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

public class Problema {

    private String descripcion;
    private enum Problema.TipoProblema;

    private List<Especialidad> especialidades = new ArrayList<Especialidad>();
    private String tiempoResolucion;

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
