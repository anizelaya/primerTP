import java.time.LocalDate;

public class Inscripcion {
    private final LocalDate fecha;
    private String estado;
    private final Estudiante estudiante; //asociación con alumno

    public Inscripcion (LocalDate fecha, String estado, Estudiante estudiante) {
        this.fecha = fecha;
        this.estado = estado;
        this.estudiante = estudiante;
    }

    //GETTER y SETTERS

    public LocalDate getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }
}
