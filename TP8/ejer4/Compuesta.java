import java.util.ArrayList;

public class Compuesta extends Tarea{

  private ArrayList<Tarea> tareas;
  private String especialidad;
  private int tiempoPorSimple;

  public Compuesta(String especialidad, int tiempoPorSimple){
    tareas = new ArrayList<Tarea>();
    setEspecialidad(especialidad);
    setTiempoPorSimple(tiempoPorSimple);
    
  }

  public String getEspecialidad() {
    return especialidad;
  }

  public void setEspecialidad(String especialidad) {
    this.especialidad = especialidad;
  }

  public void setTiempoPorSimple(int tiempoPorSimple) {
    this.tiempoPorSimple = tiempoPorSimple;
  }

  public int getTiempoPorSimple() {
    return tiempoPorSimple;
  }

  public double getCosto() {
    double res = 0;

    for (Tarea tarea : tareas) {
      res += tarea.getCosto();
    }

    return res;
  }

  public int getTiempo() {
    int res = 0;

    for (Tarea tarea : tareas) {
      res += tarea.getTiempo();
    }

    return res + getCantidadSimples() * getTiempoPorSimple();
  }

  public int getCantidadSimples() {
    int simples = 0;

    for (Tarea tarea : tareas) {
      simples += tarea.getCantidadSimples();
    }

    return simples;
  }

  public ArrayList<String> getTarea() {

    ArrayList<String> res = new ArrayList<String>();

    for (Tarea t : tareas) {
      res.addAll(t.getTarea());
    }

    return res;

  }

  public void addTarea(Tarea t){
    tareas.add(t);
  }
  
}
