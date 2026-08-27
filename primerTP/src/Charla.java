public class Charla extends Actividad{
    private String disernante;

    public Charla(int id, String titulo, int cupoMaximo){
        super(id, titulo, cupoMaximo);
        this.disernante = disernante;
    }
    public double calcularCostoMateriales(){
        return 0.0;
    }
    public String getTipo(){
        return "Charla";
    }
}
