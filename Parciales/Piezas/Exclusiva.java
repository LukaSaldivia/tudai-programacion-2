package Piezas;

import java.util.ArrayList;

import Piezas.Condiciones.Condicion;

public class Exclusiva extends Simple {

  public Exclusiva(String nombre, String descripcion, String color, int tiempo, int PLA) {
    super(nombre, descripcion, color, tiempo, PLA);
  }

  @Override
  public int cantidadSimples() {
    return 0;
  }

  @Override
  public ArrayList<Simple> buscar(Condicion c) {
    return new ArrayList<Simple>();
  }
  
}
