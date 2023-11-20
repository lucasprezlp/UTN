import java.util.ArrayList;
import java.util.List;

public class Tecnico {

    private String nombreDelTecnico;
    private List<Especialidad> especialidades; //Es clase Enum


    public Tecnico(String nombreDelTecnico, List<Especialidad> especialidades) {
        this.nombreDelTecnico = nombreDelTecnico;
        this.especialidades = especialidades; // cosultar
    }

    public void setNombreDelTecnico(String nombreDelTecnico) {
        this.nombreDelTecnico = nombreDelTecnico;
    }

    public void setEspecialidades(Especialidad especialidades) {
        this.especialidades.add(especialidades);
    }

}
