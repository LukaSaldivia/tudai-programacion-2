public class Entrenador extends Contingente {
  String federacion;

  public Entrenador(Contingente c, String federacion){
    super(c.getNombre(), c.getApellido(), c.getNumPasaporte(),c.getNacimiento(), c.getPaisOrigen());
    setFederacion(federacion);
  }

  public String getFederacion() {
    return federacion;
  }

  public void setFederacion(String federacion) {
    this.federacion = federacion;
  }
}
