public class Masajista extends Contingente {
  String titulo;
  int anosDeExperiencia;

  public Masajista(Contingente c, String titulo, int anosDeExperiencia){
    super(c.getNombre(), c.getApellido(), c.getNumPasaporte(),c.getNacimiento(), c.getPaisOrigen());
    setAnosDeExperiencia(anosDeExperiencia);
    setTitulo(titulo);
  }

  public String getTitulo() {
    return titulo;
  }

  public int getAnosDeExperiencia() {
    return anosDeExperiencia;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setAnosDeExperiencia(int anosDeExperiencia) {
    this.anosDeExperiencia = anosDeExperiencia;
  }
}
