package Piezas;

import Piezas.Condiciones.Condicion;

public class Diseño extends Compuesta {

  private Condicion condicion;

  public Diseño(String nombre, String descripcion) {
    super(nombre, descripcion);
  }

  public Condicion getCondicion() {
    return condicion;
  }

  public void setCondicion(Condicion condicion) {
    this.condicion = condicion;
  }

  @Override
  public void addPieza(Pieza p) {
    if (condicion.cumple(p)) {
      super.addPieza(p);
    }
  }
  
}
