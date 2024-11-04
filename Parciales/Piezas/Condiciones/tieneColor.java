package Piezas.Condiciones;

import Piezas.Pieza;

public class tieneColor extends Condicion{
  String color;

  public tieneColor(String color){
    this.color = color;
  }

  @Override
  public boolean cumple(Pieza p) {
    return p.getColor().contains(color);
  }


}
