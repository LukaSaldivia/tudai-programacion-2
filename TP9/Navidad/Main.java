package Navidad;

public class Main {
  public static void main(String[] args) {
    Carta c1 = new Carta("45151314");
    Carta c2 = new Carta("45151314");
    Carta c3 = new Carta("11222333");


    c1.addRegalo("PlayStation5");
    c1.addRegalo("PlayStation6");

    c2.addRegalo("Calzones");

    c3.addRegalo("Calzones");

    Buzon b = new Buzon();
    b.addDNI("45151314");
    b.addDNI("11222333");

    // b.addCarta(c1);
    b.addCarta(c2);
    b.addCarta(c3);

    System.out.println(b.getCarta("45151314").getRegalos());

    System.out.println(b.getPorcentajeCartas(new tieneRegalo("Calzones")));
  }
}
