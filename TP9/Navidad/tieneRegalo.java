package Navidad;

public class tieneRegalo extends Condicion {
  private String regalo;

  public tieneRegalo(String regalo){
    this.regalo = regalo.toLowerCase();
  }

  public boolean cumple(Carta c){
    return c.tieneRegalo(regalo);
  }
}
