package Piezas;

import java.util.ArrayList;

import Piezas.Condiciones.Condicion;

public abstract class Pieza{

  private String nombre;
  private String descripcion;

  private static int precio_gramo_PLA, costo_tiempo_impresion;

  

  public abstract ArrayList<String> getColor();
  public abstract int getTiempo();
  public abstract int getPLA();

  public abstract int cantidadSimples();

  public abstract ArrayList<Simple> buscar(Condicion c);


  public int getCosto_tiempo_impresion() {
    return costo_tiempo_impresion;
  }

  public void setCosto_tiempo_impresion(int costo_tiempo_impresion) {
    Pieza.costo_tiempo_impresion = costo_tiempo_impresion;
  }

  public int getPrecio_gramo_PLA() {
    return precio_gramo_PLA;
  }

  public void setPrecio_gramo_PLA(int precio_gramo_PLA) {
    Pieza.precio_gramo_PLA = precio_gramo_PLA;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public void setDescripcion(String descripcion){
    this.descripcion = descripcion;
  }

  public String getNombre() {
    return nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }
  

  public int getCosto(){
    return this.getPLA() * getPrecio_gramo_PLA() + this.getTiempo() * getCosto_tiempo_impresion();
  }

  public String toString(){
    String res = "\n---------\n";

    res += this.getNombre() + "\n";
    res += this.getDescripcion() + "\n";
    res += this.getColor() + "\n";
    res += this.getTiempo() + " seg\n";
    res += this.getPLA() + " g\n";
    res += "$" + this.getCosto() + "\n";

    res += "---------\n";


    return res;
  }

}