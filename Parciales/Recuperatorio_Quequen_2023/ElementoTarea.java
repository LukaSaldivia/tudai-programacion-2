import java.util.ArrayList;

public abstract class ElementoTarea {

  public abstract int getCosto();
  public abstract int getTiempo();
  public abstract ArrayList<String> getLista();
  public abstract ElementoTarea getCopia(Condicion c);
  public abstract int cantidadSimples();

  
}