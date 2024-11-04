import java.util.ArrayList;

public class Tarea extends ElementoTarea {

  private String accion;
  private int costo, tiempo;

  public Tarea(String a, int c, int t){
    setAccion(a);
    setCosto(c);
    setTiempo(t);
  }

  public Tarea(Tarea t){
    this(t.getAccion(), t.getCosto(), t.getTiempo());
  }

  public String getAccion() {
    return accion;
  }

  public void setAccion(String accion) {
    this.accion = accion;
  }

  public void setCosto(int costo) {
    this.costo = costo;
  }

  public void setTiempo(int tiempo) {
    this.tiempo = tiempo;
  }
  


  @Override
  public int getCosto() {
    return costo;
  }

  @Override
  public int getTiempo() {
    return tiempo;
  }

  @Override
  public ArrayList<String> getLista() {
    ArrayList<String> res = new ArrayList<String>();
    res.add(getAccion());
    return res;
  }

  @Override
  public ElementoTarea getCopia(Condicion c) {
    return c.cumple(this) ? this : null;
  }

  @Override
  public int cantidadSimples(){
    return 1;
  }
  
}
