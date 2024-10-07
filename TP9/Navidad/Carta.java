package Navidad;

import java.util.ArrayList;

/**
 * Carta
 */
public class Carta {

  private ArrayList<String> regalos;
  private String remitente;

  public Carta(String remitente){
    this.remitente = remitente.toLowerCase();
    this.regalos = new ArrayList<String>();
  }

  public Carta(Carta c){
    setRegalos(c.getRegalos());
    setRemitente(c.getRemitente());
  }

  public void addRegalo(String regalo){
    regalos.add(regalo.toLowerCase());
  }

  public void vaciarRegalos(){
    regalos.clear();
  }

  public String getRemitente() {
    return remitente;
  }

  public ArrayList<String> getRegalos(){
    return new ArrayList<String>(regalos);
  }

  public boolean tieneRegalo(String regalo){
    return regalos.contains(regalo.toLowerCase());
  }

  private void setRemitente(String DNI){
    this.remitente = DNI;
  }

  private void setRegalos(ArrayList<String> regalos){
    this.regalos = new ArrayList<String>(regalos);
  }



  public boolean equals(Object o){
    try {
      Carta c = (Carta) o;
      return this.getRemitente().equals(c.getRemitente());
    } catch (Exception e) {
      return false;
    }
  }
  
}