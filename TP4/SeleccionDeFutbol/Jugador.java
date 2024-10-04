public class Jugador extends Contingente{
  String posicion;
  String pieHabil;
  int golesHistoria;

  public Jugador(Contingente c, String posicion, String pieHabil, int golesHistoria){

    super(c.getNombre(), c.getApellido(), c.getNumPasaporte(),c.getNacimiento(), c.getPaisOrigen());

    setGolesHistoria(golesHistoria);
    setPieHabil(pieHabil);
    setPosicion(posicion);

  }

  public String getPosicion() {
    return posicion;
  }

  public String getPieHabil() {
    return pieHabil;
  }

  public int getGolesHistoria() {
    return golesHistoria;
  }

  public void setGolesHistoria(int golesHistoria) {
    this.golesHistoria = (int) Math.sqrt(Math.pow(golesHistoria,2.0));
  }

  public void setPieHabil(String pieHabil) {
    this.pieHabil = pieHabil;
  }

  public void setPosicion(String posicion) {
    this.posicion = posicion;
  }
}
