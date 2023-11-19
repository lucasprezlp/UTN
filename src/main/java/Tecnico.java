import java.util.ArrayList;
import java.util.List;

public class Tecnico {

    private String nombreDelTecnico;
    private List<Especialidad> especialidades = new ArrayList<Especialidad>();

    private String comentariosResolucionIncidentes;

    public void setNombreDelTecnico(String nombreDelTecnico) {
        this.nombreDelTecnico = nombreDelTecnico;
    }

    public void setEspecialidades(Especialidad especialidades) {
        this.especialidades.add(especialidades);
    }

    public void setComentariosResolucionIncidentes(String comentariosResolucionIncidentes) {
        this.comentariosResolucionIncidentes = comentariosResolucionIncidentes;
    }
}
