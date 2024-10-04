import java.util.ArrayList;

public class Simple extends Tarea {

  private String tarea;
  private double costo;
  private int tiempo;

  public Simple(String tarea, double costo, int tiempo){
    setCosto(costo);
    setTarea(tarea);
    setTiempo(tiempo);
  }

  public void setTarea(String tarea) {
    this.tarea = tarea;
  }

  public void setCosto(double costo) {
    this.costo = costo;
  }

  public void setTiempo(int tiempo) {
    this.tiempo = tiempo;
  }

  @Override
  public double getCosto() {
    return costo;
  }

  @Override
  public int getTiempo() {
    return tiempo;
  }

  @Override
  public int getCantidadSimples() {
    return 1;
  }

  @Override
  public ArrayList<String> getTarea() {
    ArrayList<String> res = new ArrayList<String>();
    res.add(tarea);
    return res;
  }
  
}
