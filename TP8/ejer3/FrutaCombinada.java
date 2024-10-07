public class FrutaCombinada extends Fruta{
  private Fruta f1;
  private Fruta f2;

  public FrutaCombinada(Fruta f1, Fruta f2){
    this.f1 = f1;
    this.f2 = f2;
  }

  public double fuerza(Personaje p){
    return f1.fuerza(p) + f2.fuerza(p);
  }
}
