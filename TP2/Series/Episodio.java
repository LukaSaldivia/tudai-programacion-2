public class Episodio {

  String titulo;
  String descripcion;
  boolean visto;
  int calificacion;

  public Episodio(String titulo, String descripcion){
    setTitulo(titulo);
    setDescripcion(descripcion);
    visto = false;
    calificacion = -1;
  }

  public Episodio(Episodio episodio){
    this(episodio.getTitulo(), episodio.getDescripcion());
    setCalificacion(episodio.getCalificacion());
    setVisto(episodio.estaVisto(),episodio.getCalificacion());
  }



  public int getCalificacion() {
    return calificacion;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public String getTitulo() {
    return titulo;
  }

  public boolean estaVisto(){
    return this.visto;
  }

  public void setCalificacion(int calificacion) {
    if (calificacion > 5 || calificacion == 0) {
      System.out.println("Error, la calificacion ingresada no cumple el rango de -R{-0} < x < 5");
    }else{
      this.calificacion = calificacion;
    }
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion == null ? "Descripcion" : descripcion;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo == null ? "Episodio" : titulo;
  }

  public void setVisto(boolean visto, int calificacion) {
    this.visto = visto;

    if (visto) {
      if (calificacion <= 0 || calificacion > 5) {
        this.visto = false;
      }else{
        setCalificacion(calificacion);
      }
    }

  }

  public String toString(){
    return "\n"+'"'+this.getTitulo()+'"'+"\nDescripcion: "+this.getDescripcion()+"\nCalificacion: "+this.getCalificacion()+"\n"; 
  }


}
