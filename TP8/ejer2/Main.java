import java.util.ArrayList;

/**
 * Main
 */
public class Main {

  

  public static void main(String[] args) {
    Paquete p1 = new Paquete("Santa Cruz 937", "Lavalle 1268", 5, false, 1);
    Paquete p2 = new Paquete("Santa Cruz 931", "Lavalle 1261", 5, false, 2);
    Paquete p3 = new Paquete("Santa Cruz 932", "Lavalle 1238", 10, true, 3);
  
    ArrayList<Envio> paquetes = new ArrayList<Envio>();

    paquetes.add(p1);
    paquetes.add(p2);
    paquetes.add(p3);

    ComboPostal cp1 = new ComboPostal(paquetes, 5);

    paquetes.add(cp1);

    ComboPostal cp2 = new ComboPostal(paquetes, 7);

    System.out.println(cp2.getPeso());
  }


}