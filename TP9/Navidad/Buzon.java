package Navidad;

import java.util.ArrayList;

public class Buzon {
  private ArrayList<String> listaBlanca;
  private ArrayList<Carta> cartas;
  private final static String regaloListaNegra = "TROZO DE CARBÓN";

  public Buzon() {
    listaBlanca = new ArrayList<String>();
    cartas = new ArrayList<Carta>();
  }

  public void addDNI(String dni) {
    listaBlanca.add(dni);
  }

  public void deleteDNI(String dni) {
    listaBlanca.remove(dni);
  }

  public void addCarta(Carta c) {
    if (!cartas.contains(c)) {

      if (!listaBlanca.contains(c.getRemitente())) {
        c.vaciarRegalos();
        c.addRegalo(regaloListaNegra);

      }

      cartas.add(c);
    }
  }

  public Carta getCarta(String DNI){
    Carta c = null;

    for (Carta carta : cartas) {
      if (carta.getRemitente().equals(DNI)) {
        c = new Carta(carta);
      }
    }

    return c;
  }

  public int getCantidadCartas(){
    return cartas.size();
  }

  public int getCantidadCartas(Condicion c){
    int res = 0;

    for (Carta carta : cartas) {
      if (c.cumple(carta)) {
        res++;
      }
    }

    return res;
  }

  public double getPorcentajeCartas(Condicion c){
    double res = 0.0;

    for (Carta carta : cartas) {
      if (c.cumple(carta)) {
        res++;
      }
    }

    return res / getCantidadCartas() * 100;
  }

}
