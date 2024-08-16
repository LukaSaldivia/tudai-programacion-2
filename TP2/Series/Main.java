import java.util.ArrayList;

class Main{
  public static void main(String[] args) {
    Episodio e1t1 = new Episodio("Un inicio", "Episodio dedicado a iniciar la trama");
    Episodio e2t1 = new Episodio("Un cliffhanger", "Episodio dedicado a dejar en suspenso");

    ArrayList<Episodio> est1 = new ArrayList<Episodio>();
    est1.add(e1t1);
    est1.add(e2t1);

    e1t1.setVisto(true,5);
    e2t1.setVisto(true,2);
    
    Episodio e1t2 = new Episodio("Un nuevo inicio", "Episodio dedicado a bajar la calidad");
    Episodio e2t2 = new Episodio("Un nuevo cliffhanger?", "Episodio dedicado a dejar en duda la produccion de la siguiente temporada");

    e1t2.setVisto(true, 1);
    e2t2.setVisto(true, 1);

    ArrayList<Episodio> est2 = new ArrayList<Episodio>();
    est1.add(e1t2);
    est1.add(e2t2);


    Temporada t1 = new Temporada("Temporada inicial", "Que gran expectativa", est1);
    Temporada t2 = new Temporada("Temporada final", "Al final si se cancelo", est2);

    ArrayList<Temporada> ts = new ArrayList<Temporada>();
    ts.add(t1);
    ts.add(t2);

    Serie serie = new Serie("The Flash", "Un chico que corre muy muy rapido","Ni idea", "Superheroes", ts);

    System.out.println(serie.getEpisodiosVistos());
    System.out.println(serie.getPromedio());
    System.out.println(serie.isFullVista());
  }
}