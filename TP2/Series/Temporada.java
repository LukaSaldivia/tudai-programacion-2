import java.util.ArrayList;


public class Temporada {
  String titulo;
  String descripcion;

  ArrayList<Episodio> episodios;

  public Temporada(String titulo, String descripcion, ArrayList<Episodio> episodios){
    this.episodios = new ArrayList<Episodio>();
    setTitulo(titulo);
    setDescripcion(descripcion);
    setEpisodios(episodios);
  }

  public Temporada(Temporada temporada){
    this(temporada.getTitulo(), temporada.getDescripcion(), temporada.getEpisodios());
  }

  public String getTitulo() {
    return titulo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public ArrayList<Episodio> getEpisodios() {
    return new ArrayList<Episodio>(this.episodios);
  }


  public void setTitulo(String titulo) {
    this.titulo = titulo == null ? "Titulo" : titulo;
  }
  
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion == null ? "Descripcion" : descripcion;
  }
  
  public void setEpisodios(ArrayList<Episodio> episodios) {
    for (int i = 0; i < episodios.size(); i++) {
      addEpisodio(episodios.get(i));
    }
  }

  public ArrayList<Episodio> getEpisodiosVistos(){
    ArrayList<Episodio> res = new ArrayList<Episodio>();
    for (int i = 0; i < getEpisodios().size(); i++) {
      if (getEpisodios().get(i).visto) {
        res.add(getEpisodios().get(i));
      }
    }
    return res;
  }

  public void addEpisodio(Episodio episodio){
    if (episodio != null) {
      this.episodios.add(new Episodio(episodio));
    }
  }

  public int getCantidadEpisodiosVistos(){
    return getEpisodiosVistos().size();
  }

  public double getPromedio(){
    double res = 0.0;

    for (int i = 0; i < getEpisodiosVistos().size(); i++) {
      res+= getEpisodiosVistos().get(i).calificacion;
    }

    return res / getCantidadEpisodiosVistos();
  }


}
