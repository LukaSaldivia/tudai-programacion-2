import java.util.ArrayList;

public class Repetitiva extends Tarea{

  private ArrayList<Tarea> tareas;
  private int repeticiones;

  public Repetitiva(int repeticiones){
    tareas = new ArrayList<Tarea>();
    this.repeticiones = repeticiones;
  }

  public double getCosto() {
    double res = 0;
     for (Tarea tarea : tareas) {
      res += tarea.getCosto();
     }

     return res * repeticiones;
  }

  public int getTiempo() {
    int res = 0;
    for (Tarea tarea : tareas) {
      res += tarea.getTiempo();
    }

    return res;
  }

  public int getCantidadSimples() {

    int simples = 0;

    for (Tarea tarea : tareas) {
      simples+= tarea.getCantidadSimples();
    }

    return simples * repeticiones;

  }

  public ArrayList<String> getTarea() {
    ArrayList<String> res = new ArrayList<String>();
    for (int i = 0; i < repeticiones; i++) {
      for (Tarea tarea : tareas) {
        res.addAll(tarea.getTarea());
      }
    }

    return res;
  }

  public void addTarea(Tarea t){
    tareas.add(t);
  }
  
}
