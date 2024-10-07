public class FrutaPorPeso extends Fruta{
  private int factor;

  public FrutaPorPeso(int factor){
    this.factor = factor;
  }

  public double fuerza(Personaje p){
    return factor*p.getPeso();
  }
}
