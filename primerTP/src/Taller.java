public class Taller extends Actividad{
    private boolean requiereNotebook;

    public Taller(int id,String titulo, int cupoMaximo){
        super(id, titulo, cupoMaximo);
        this.requiereNotebook = requiereNotebook;

    }
    public double calcularCostoMateriales(){
      return requiereNotebook ? 5000.0 : 2000.0;
    }
    public String getTipo(){
        return "Taller";
    }

}
