package Piezas;

import java.util.ArrayList;

import Piezas.Condiciones.Condicion;

public class Simple extends Pieza{

  private String color;
  private int tiempo, PLA;

  public Simple(String nombre, String descripcion, String color, int tiempo, int PLA){
    setNombre(nombre);
    setColor(color);
    setDescripcion(descripcion);
    setPLA(PLA);
    setTiempo(tiempo);
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setPLA(int pLA) {
    PLA = pLA;
  }

  public void setTiempo(int tiempo) {
    this.tiempo = tiempo;
  }

  public ArrayList<String> getColor() {
    ArrayList<String> res = new ArrayList<String>();

    res.add(color);

    return res;
  }

  public int getTiempo() {
    return tiempo;
  }

  public int getPLA() {
    return PLA;
  }

  public int cantidadSimples(){
    return 1;
  }

  @Override
  public ArrayList<Simple> buscar(Condicion c) {
    ArrayList<Simple> res = new ArrayList<Simple>();

    if (c.cumple(this)) {
      res.add(this);
    }

    return res;
  }
  
}
