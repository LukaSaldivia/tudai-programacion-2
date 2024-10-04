public class Paquete extends Envio{

  private String destino, origen;
  private boolean aDomicilio;
  private double peso;



  public Paquete(String destino, String origen, double peso, boolean aDomicilio, int tracking){
    setPeso(peso);
    setOrigen(origen);
    setDestino(destino);
    setaDomicilio(aDomicilio);
    setTracking(tracking);
  }

  public Paquete(Paquete p){
    this(p.getDestino(), p.getOrigen(), p.getPeso(), p.seEntregaEnDomicilio(), p.getTracking());
  }


  public void setaDomicilio(boolean aDomicilio) {
    this.aDomicilio = aDomicilio;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public void setDestino(String destino) {
    this.destino = destino;
  }

  public void setOrigen(String origen) {
    this.origen = origen;
  }

  public boolean seEntregaEnDomicilio(){
    return aDomicilio;
  }

  public String getOrigen() {
    return origen;
  }

  @Override
  public String getDestino() {
    return destino;
  }

  @Override
  public double getPeso() {
    return peso;
  }
  
}
