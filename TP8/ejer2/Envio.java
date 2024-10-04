public abstract class Envio {
  protected int tracking;

  public abstract String getDestino();
  public abstract double getPeso();
  public abstract String getOrigen();
  
  public abstract void setDestino(String destino);
  public abstract void setOrigen(String origen);

  public void setTracking(int tracking) {
    this.tracking = tracking;
  }

  public int getTracking() {
    return tracking;
  }
}
