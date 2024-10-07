import java.util.ArrayList;

public class Tripulacion extends Entidad {
  ArrayList<Personaje> tripulacion;

  public Tripulacion(String nombre){
    tripulacion = new ArrayList<Personaje>();
  }

  public void addPersonaje(Personaje p){
    tripulacion.add(p);
  }

  @Override
  public int getEdad() {
    int edad = 0;

    for (Personaje personaje : tripulacion) {
      if (personaje.getEdad() > edad) {
        edad = personaje.getEdad();
      }
    }

    return edad;
  }

  @Override
  public double getFuerza() {
    double fuerza = 0;
    for (Personaje personaje : tripulacion) {
      fuerza += personaje.getFuerza();
    }
    return fuerza;
  }

  @Override
  public int getPeso() {
    return tripulacion.get(0).getPeso();
  }

  public int getCantidadTripulantes(){
    return tripulacion.size();
  }

  
}
