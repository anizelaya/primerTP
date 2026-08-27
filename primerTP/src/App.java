import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE ADMINISTRACION DE EVENTOS UNIVERSITARIOS ===\n");

        EventoUniversitario evento1 = new EventoUniversitario("AZ-001", "Hackaton Abril", 12500.0, false);
        EventoUniversitario evento2 = new EventoUniversitario("AZ-002", "Hackaton Junio", 0.0, true);

        EventoUniversitario copiaEvento1 = new EventoUniversitario(evento1);
        EventoUniversitario copiaEvento2 = new EventoUniversitario(evento2);

        System.out.println("=== DATOS DE LOS EVENTOS ORIGINALES ===");
        evento1.mostrarDatos();
        evento2.mostrarDatos();

        System.out.println("=== DATOS DE LAS COPIAS GENERADAS ===");
        copiaEvento1.mostrarDatos();
        copiaEvento2.mostrarDatos();

        System.out.println("Total de eventos registrados (originales + copias): "
                + EventoUniversitario.getCantidadEventos() + " eventos.");
        //EJERCICIO 2

        //a)lista de estudiantes
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("49449", "Zelaya, Anahi"));
        estudiantes.add(new Estudiante("54129", "Perez, Juan"));
        estudiantes.add(new Estudiante("65989", "Martinez, Jorge"));
        estudiantes.add(new Estudiante("44529", "Vargas, Damian"));
        estudiantes.add(new Estudiante("41254", "Messi, Leonel"));

        System.out.println("Se registraron: " + estudiantes.size() + " estudiantes en total");

        //c)asignar salas
        Sala salaSistemas = new Sala(302, "Laboratorio de Sistemas");
        Sala auditorioPrincipal = new Sala(101, "Auditorio Principal");

        evento1.asignarSala(salaSistemas);
        evento2.asignarSala(auditorioPrincipal);

        //d)crear Actividades
        evento1.crearActividad(01, "Introduccion a programacion", 10);
        evento1.crearActividad(02, "Programación", 10);
        evento2.crearActividad(01, "Taller de electricidad", 20);

        //e)Inscribir estudiantes
        Actividad introAct = evento1.getActividades().get(0);

        introAct.inscribir(estudiantes.get(0)); //Inscribe a Anahi Zelaya teoricamente
        introAct.inscribir(estudiantes.get(1)); //Inscribe a Juan Perez teoricamente
        introAct.inscribir(estudiantes.get(2)); //Inscribe a Jorge Martinez teoricamente

        //f) mostrar el resumen de datos por cada evento creado
        System.out.println("=== EVENTOS REGISTRADOS ===");
        evento1.mostrarDatos();
        evento2.mostrarDatos();

        //g) mostrar el total de eventos creados
        System.out.println("Cantidad total de eventos cargados en memoria: "
                + EventoUniversitario.getCantidadEventos() + " eventos.");


    }
}


