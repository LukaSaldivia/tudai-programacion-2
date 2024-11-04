package Piezas;

import java.util.ArrayList;

import Piezas.Condiciones.Condicion;

public class Compuesta extends Pieza{

  private ArrayList<Pieza> piezas;
  private int tiempo_extra_por_pieza, PLA_extra_por_simple;

  public Compuesta(String nombre, String descripcion){
    setNombre(nombre);
    setDescripcion(descripcion);
    piezas = new ArrayList<Pieza>();
  }

  public void setPLA_extra_por_simple(int pLA_extra_por_simple) {
    PLA_extra_por_simple = pLA_extra_por_simple;
  }

  public void setTiempo_extra_por_pieza(int tiempo_extra_por_pieza) {
    this.tiempo_extra_por_pieza = tiempo_extra_por_pieza;
  }

  public int getPLA_extra_por_simple() {
    return PLA_extra_por_simple;
  }

  public int getTiempo_extra_por_pieza() {
    return tiempo_extra_por_pieza;
  }

  @Override
  public ArrayList<String> getColor() {
    ArrayList<String> res = new ArrayList<String>();

    for (Pieza pieza : piezas) {
      ArrayList<String> colores = pieza.getColor();

      for (String color : colores) {
        if (!res.contains(color)) {
          res.add(color);
        }
      }
    }

    return res;
  }

  public int getTiempo() {

    int res = 0;

    for (Pieza pieza : piezas) {
      res += pieza.getTiempo();
    }

    return res + tiempo_extra_por_pieza * piezas.size();

  }

  public int cantidadSimples(){
    int res = 0;

    for (Pieza pieza : piezas) {
      res += pieza.cantidadSimples();
    }

    return res;
  }

  public int getPLA() {
    int res = 0;

    for (Pieza pieza : piezas) {
      res += pieza.getPLA();
    }

    return res + (this.cantidadSimples() * PLA_extra_por_simple);
  }
  

  public ArrayList<Simple> buscar(Condicion c) {
    ArrayList<Simple> res = new ArrayList<Simple>();

    for (Pieza pieza : piezas) {
      res.addAll(pieza.buscar(c));
    }

    return res;
  }

  public ArrayList<Pieza> getPiezas() {
    return new ArrayList<Pieza>(piezas);
  }

  public void addPieza(Pieza p){
    piezas.add(p);
  }

}
