import java.time.LocalDate;

abstract class Contingente{
  String nombre;
  String apellido;
  int numPasaporte;
  LocalDate nacimiento;
  String paisOrigen;

  private boolean viajando;
  private boolean concentrando;

  public Contingente(String nombre, String apellido, int numPasaporte, LocalDate nacimiento, String paisOrigen){
    setNombre(nombre);
    setApellido(apellido);
    setNacimiento(nacimiento);
    setNumPasaporte(numPasaporte);
    setPaisOrigen(paisOrigen);

    viajando = false;
    concentrando = false;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public LocalDate getNacimiento() {
    return nacimiento;
  }

  public int getNumPasaporte() {
    return numPasaporte;
  }

  public String getPaisOrigen() {
    return paisOrigen;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public void setConcentrando(boolean concentrando) {
    this.concentrando = concentrando;
  }

  public void setNacimiento(LocalDate nacimiento) {
    this.nacimiento = nacimiento;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setNumPasaporte(int numPasaporte) {
    this.numPasaporte = numPasaporte;
  }

  public void setPaisOrigen(String paisOrigen) {
    this.paisOrigen = paisOrigen;
  }

  public void setViajando(boolean viajando) {
    this.viajando = viajando;
  }

  public String getEstado(){
    if (concentrando) {
      return "Concentrando";
    }

    if (viajando) {
      return "Viajando";
    }

    return "En país de origen";
  }



  

}