import java.util.ArrayList;

public class Compuesta extends ElementoTarea {
  protected ArrayList<ElementoTarea> actividades;
  protected String especialidad;
  protected int tiempoExtraPorSimple;

  public Compuesta(String e, int t){
    setEspecialidad(e);
    setTiempoExtraPorSimple(t);
    actividades = new ArrayList<ElementoTarea>();
  }

  public Compuesta(Compuesta c){
    this(c.getEspecialidad(), c.getTiempoExtraPorSimple());
    for (ElementoTarea elementoTarea : c.getActividades()) {
      this.addTarea(elementoTarea);
    }
  }
  
  public void setTiempoExtraPorSimple(int tiempoExtraPorSimple) {
    this.tiempoExtraPorSimple = tiempoExtraPorSimple;
  }

  public void setEspecialidad(String especialidad) {
    this.especialidad = especialidad;
  }

  public String getEspecialidad() {
    return especialidad;
  }

  public ArrayList<ElementoTarea> getActividades() {
    return new ArrayList<ElementoTarea>(actividades);
  }

  public int getTiempoExtraPorSimple() {
    return tiempoExtraPorSimple;
  }

  @Override
  public int getCosto() {
    int res = 0;

    for (ElementoTarea elementoTarea : actividades) {
      res += elementoTarea.getCosto();
    }

    return res;
  }
  @Override
  public int getTiempo() {

    int res = 0;

    for (ElementoTarea elementoTarea : actividades) {
      res += elementoTarea.getTiempo();
    }

    return res + getTiempoExtraPorSimple() * cantidadSimples();

  }
  @Override
  public ArrayList<String> getLista() {
    ArrayList<String> res = new ArrayList<String>();

    for (ElementoTarea elementoTarea : actividades) {
      res.addAll(elementoTarea.getLista());
    }

    return res;
  }
  @Override
  public ElementoTarea getCopia(Condicion c) {

    Compuesta copia = createCopy();
    boolean agrego = false;

    for (ElementoTarea elementoTarea : actividades) {
      ElementoTarea copiaHijo = elementoTarea.getCopia(c);
      if (!copiaHijo.equals(null)) {
        copia.addTarea(copiaHijo);
        agrego = true;
      }
    }

    return agrego ? copia : null;


  }
  @Override
  public int cantidadSimples() {
    int res = 0;

    for (ElementoTarea elementoTarea : actividades) {
      res += elementoTarea.cantidadSimples();
    }

    return res;
  }

  public void addTarea(ElementoTarea e){
    if (!e.equals(null)) {
      actividades.add(e);
    }
  }

  private Compuesta createCopy(){
    return new Compuesta(getEspecialidad(), getTiempoExtraPorSimple());
  }

  
}
