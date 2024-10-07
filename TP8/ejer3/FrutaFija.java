public class FrutaFija extends Fruta {
  private double fijo;

  public FrutaFija(double fijo){
    this.fijo = fijo;
  }

  public double fuerza(Personaje p){
    return fijo;
  }
  
}
