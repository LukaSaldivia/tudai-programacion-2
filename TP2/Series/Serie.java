import java.util.ArrayList;

public class Serie {
  ArrayList<Temporada> temporadas;

  String titulo, descripcion, creador, genero;

  public Serie(String titulo, String descripcion, String creador, String genero, ArrayList<Temporada> temporadas){
    this.temporadas = new ArrayList<Temporada>();
    setCreador(creador);
    setDescripcion(descripcion);
    setGenero(genero);
    setTitulo(titulo);
    setTemporadas(temporadas);
  }

  public String getCreador() {
    return creador;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public String getGenero() {
    return genero;
  }

  public String getTitulo() {
    return titulo;
  }

  public ArrayList<Temporada> getTemporadas() {
    return new ArrayList<Temporada>(temporadas);
  }

  private void setTitulo(String titulo) {
    this.titulo = titulo == null ? "Titulo" : titulo;
  }

  private void setCreador(String creador) {
    this.creador = creador == null ? "Creador" : creador;
  }

  private void setDescripcion(String descripcion) {
    this.descripcion = descripcion == null ? "Descripcion" : descripcion;
  }

  private void setGenero(String genero) {
    this.genero = genero == null ? "Genero" : genero;
  }

  public void setTemporadas(ArrayList<Temporada> temporadas) {
    for (int i = 0; i < temporadas.size(); i++) {
      addTemporada(temporadas.get(i));
    }
  }

  public void addTemporada(Temporada temporada){
    if (temporada != null) {
      this.temporadas.add(new Temporada(temporada));
    }
  }

  public ArrayList<Episodio> getEpisodiosVistos(){
    ArrayList<Episodio> res = new ArrayList<Episodio>();
    for (int i = 0; i < getAllEpisodios().size(); i++) {
      if (getAllEpisodios().get(i).estaVisto()) {
        res.add(getAllEpisodios().get(i));
      }
    }

    return res;
  }

  public ArrayList<Episodio> getEpisodiosVistos(String tituloTemporada){
    return this.getTemporada(tituloTemporada).getEpisodiosVistos();
  }

  public ArrayList<Episodio> getAllEpisodios(){
    ArrayList<Episodio> res = new ArrayList<Episodio>();
    for (int i = 0; i < getTemporadas().size(); i++) {
      res.addAll(getTemporadas().get(i).getEpisodios());
    }

    return res;
  }

  public int getCantidadEpisodiosVistos(){
    return this.getEpisodiosVistos().size();
  }

  public Temporada getTemporada(String tituloTemporada){
    for (int i = 0; i < getTemporadas().size(); i++) {
      if (getTemporadas().get(i).getTitulo().equals(tituloTemporada)) {
        return getTemporadas().get(i);
      }
    }

    return null;
  }

  public double getPromedio(){
    double res = 0.0;

    for (int i = 0; i < getCantidadEpisodiosVistos(); i++) {
      res+= getEpisodiosVistos().get(i).getCalificacion();
    }

    return res / getCantidadEpisodiosVistos();
  }

  public double getPromedio(String tituloTemporada){
    Temporada temporada = this.getTemporada(tituloTemporada);

    if (temporada != null) {
      return temporada.getPromedio();
    }

    return 0.0;
  }

  public boolean isFullVista(){
    return getEpisodiosVistos().size() == getAllEpisodios().size();
  }


  



}
