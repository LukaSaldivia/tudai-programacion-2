package Piezas.Condiciones;

import Piezas.Pieza;

public class tiempoMenor extends Condicion{
  int tiempo;

  public tiempoMenor(int t){
    tiempo = t;
  }

  @Override
  public boolean cumple(Pieza p) {
    return p.getTiempo() < tiempo;
  }
  
}
