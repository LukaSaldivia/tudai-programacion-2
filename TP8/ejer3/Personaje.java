public class Personaje extends Entidad {
  private final static double fuerzaBase = 125;

  private int edad;
  private int peso;
  private Fruta fruta;

  public Personaje(String nombre, int edad, int peso){
    super();
    setNombre(nombre);
    setEdad(edad);
    setPeso(peso);
    this.fruta = new FrutaFija(fuerzaBase);
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }

  public void setFruta(Fruta f){
    this.fruta = f;
  }

  public int getPeso() {
    return peso;
  }



  public double getFuerza() {
    return fruta.fuerza(this);
  }

  
}
