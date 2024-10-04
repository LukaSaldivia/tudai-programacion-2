import java.util.ArrayList;

public class ComboPostal extends Envio {

  private ArrayList<Envio> envios;

  public ComboPostal(ArrayList<Envio> envios, int tracking){
    this.tracking = tracking;
    this.envios = new ArrayList<Envio>();
    setEnvios(envios);

  }

  @Override
  public String getDestino() {
    return envios.get(0).getDestino();
  }

  @Override
  public double getPeso() {

    double res = 0.0;
    for (Envio envio : envios) {
      res += envio.getPeso();
    }
    return res;

  }

  public String getOrigen(){
    return envios.get(0).getOrigen();
  }


  public void addEnvio(Envio e){
    e.setTracking(this.getTracking());
    e.setOrigen(this.getOrigen());
    e.setDestino(this.getDestino());
    envios.add(e);
  }

  public void setTracking(int tracking){
    for (Envio envio : envios) {
      envio.setTracking(tracking);
    }
  }

  @Override
  public void setDestino(String destino) {


    for (Envio envio : envios) {
      envio.setDestino(destino);
    }

  }

  @Override
  public void setOrigen(String origen) {
    for (Envio envio : envios) {
      envio.setOrigen(origen);
    }
  }

  public void setEnvios(ArrayList<Envio> envios){
    if (envios.size() == 0)
      throw new Error("No se puede iniciar un combo sin envios");

      Envio primerEnvio = envios.get(0);
      primerEnvio.setTracking(tracking);

      this.envios.add(primerEnvio);

      for (int i = 1; i < envios.size(); i++) {
        addEnvio(envios.get(i));
      }




  }
  
}
