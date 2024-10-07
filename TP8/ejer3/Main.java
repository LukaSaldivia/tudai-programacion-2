public class Main {
  public static void main(String[] args) {
    Personaje pacman = new Personaje("Pacman", 23, 60);
    Personaje sonic = new Personaje("Sonic", 17, 60);
    Personaje piece = new Personaje("Piece", 999, 1);

    FrutaPorPeso potenciador = new FrutaPorPeso(20);

    Tripulacion t = new Tripulacion("Jueguitos");
    t.addPersonaje(pacman);
    t.addPersonaje(sonic);

    piece.setFruta(potenciador);

    System.out.println(t.getCantidadTripulantes());
    System.out.println(t.getFuerza());
    System.out.println(t.getEdad());

    System.out.println(piece.getFuerza());
  }
}
