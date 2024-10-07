public abstract class Entidad{
  private String nombre;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public abstract int getEdad();
  public abstract double getFuerza();
  public abstract int getPeso();

}