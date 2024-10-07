package Navidad;

public class NOT extends Condicion {
  private Condicion cond;

  public NOT(Condicion cond){
    this.cond = cond;
  }

  public boolean cumple(Carta c){
    return !cond.cumple(c);
  }

}
