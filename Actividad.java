import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Actividad{
    private int id;
    private String titulo;
    private int cupoMaximo;
    public final int CUPO_MINIMO =3;
    //Clase asociativa
    private final List<Inscripcion> inscripciones;

    public Actividad (int id, String titulo, int cupoMaximo){
        this.id=id;
        this.titulo=titulo;
        this.cupoMaximo = cupoMaximo;
        this.inscripciones= new ArrayList<>();//se inicializa
    }

//Inscripcion de estudiantes
    public Inscripcion inscribir (Estudiante estudiante){
        if (inscripciones.size()< cupoMaximo){  //cant actual de alumnos
            Inscripcion nuevaInscripcion = new Inscripcion(LocalDate.now(), "Confirmada", estudiante);
            inscripciones.add(nuevaInscripcion); //agrega inscripcion dentro de la lista
            return nuevaInscripcion;
        } else {
            System.out.println("No hay más cupos");
            return null;
        }
    }

    public void mostrarInscripciones(){
        if (inscripciones.isEmpty()){
            System.out.println("no hay alumnos inscriptos");
        } else {
            for (Inscripcion ins : inscripciones) //nombre temporal {
                System.out.println(" - Legajo: " + ins.getEstudiante().getLegajo()
                        + " | Nombre: " + ins.getEstudiante().getNombre()
                        + " | Fecha: " + ins.getFecha()
                        + " | Estado: " + ins.getEstado());
            }
        }

    //GETTERS Y SETTERS
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }
    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public int getCUPO_MINIMO() {
        return CUPO_MINIMO;
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }
}


