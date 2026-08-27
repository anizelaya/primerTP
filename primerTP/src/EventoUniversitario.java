import java.util.ArrayList;
import java.util.List;

public class EventoUniversitario {
    private final String ID;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos;

    //Agregacion ejercicio2
    private Sala sala;
    // Composicion ejercicio2 las actividades dependen del evento
    private final List<Actividad> actividades;

    public EventoUniversitario (String ID, String titulo, double costoBase, boolean gratuito){
        this.ID=ID;
        this.titulo= titulo;
        this.costoBase= costoBase;
        this.gratuito= gratuito;
        this.actividades=new ArrayList<>(); //se inicializa la coleccion de la composición
        cantidadEventos++;
    }

    public EventoUniversitario (EventoUniversitario otroEvento) {
        this.ID = otroEvento.ID;
        this.titulo = otroEvento.titulo;
        this.costoBase = otroEvento.costoBase;
        this.gratuito = otroEvento.gratuito;
        this.actividades=new ArrayList<>(otroEvento.actividades);
        cantidadEventos++;
    }

    public void asignarSala(Sala sala) {
        this.sala = sala;
    }

    public void crearActividad(int ID, String titulo, int cupo){
        Actividad nuevaActividad= new Actividad (ID, titulo, cupo);
        this.actividades.add(nuevaActividad);
    }

    public double calcularCostoEstimado() {
        if (this.gratuito) {
            return 0.0;
        }
        return this.costoBase * 1.21;
    }

    public void mostrarDatos(){
        System.out.println("__________________________________________");
        System.out.println("Evento ID: "+ID);
        System.out.println("Título: "+titulo);
        System.out.println("Costo base: $" + costoBase);
        System.out.println("Costo Estimado (con 21% IVA si aplica): $" + String.format("%.2f", calcularCostoEstimado()));
        if (this.sala != null) {
            System.out.println("Sala Asignada: " + sala.getNombre() + " (ID: " + sala.getId() + ")");
        }else {
            System.out.println("Pendiente de asignación");
        }
        //Info de acividades e inscripciones
        System.out.println("Agenda de actividades:");
        if (actividades.isEmpty()){
            System.out.println("No hay actividades asignadas");
        } else {
            for (Actividad act: actividades){
                System.out.println("  Actividad ID: " +act.getId()+ "/" +act.getTitulo() + "/" + " Cupo Máx: " + act.getCupoMaximo());
                act.mostrarInscripciones();
            }
        }
        System.out.println("___________________________________________");


    }
    public static int getCantidadEventos() {
        return cantidadEventos;
    }
    //Getters y setters

    public String getID() {
        return ID;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) { this.titulo = titulo;}

    public double getCostoBase() {
        return costoBase;
    }
    public void setCostoBase(double costoBase) { this.costoBase = costoBase;}

    public boolean isGratuito(boolean gratuito) {
        return gratuito;
    }
    public void setGratuito(boolean gratuito) {
        this.gratuito = gratuito;
    }

    public Sala getSala() { return sala;}

    public List<Actividad> getActividades() { return actividades; }
}

