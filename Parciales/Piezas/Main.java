package Piezas;

import Piezas.Condiciones.tieneColor;

public class Main {
  public static void main(String[] args) {
    // imprimir skate

    
    Simple eje = new Simple("eje", "sostenedor de ruedas", "negro", 10, 5);
    eje.setCosto_tiempo_impresion(10);
    eje.setPrecio_gramo_PLA(25);
    Simple rueda = new Simple("rueda", "rueda", "blanco", 20, 10);
    Compuesta ejeConRuedas = new Compuesta("eje con ruedas", "pieza montada");
    ejeConRuedas.addPieza(eje);
    ejeConRuedas.addPieza(eje);
    ejeConRuedas.addPieza(rueda);
    ejeConRuedas.addPieza(rueda);

    Simple tabla = new Simple("tabla", "donde se para el muñeco", "negro", 50, 25);

    Compuesta skate = new Compuesta("skate", "pieza completa");
    skate.setPLA_extra_por_simple(50);
    skate.setTiempo_extra_por_pieza(10);

    skate.addPieza(ejeConRuedas);
    skate.addPieza(ejeConRuedas);
    skate.addPieza(tabla);

    System.out.println(skate.getCosto());

    // System.out.println(skate.buscar(new tieneColor("blanco")));

    Exclusiva dragon = new Exclusiva("dragon", "decoracion de dragon para tablas de skate", "dorado", 60, 10);

    Exclusiva tablaConZocaloDragon = new Exclusiva("tabla para dragon","tabla con zocalo para impresion3d de dragon", "negro", 60, 20);
    Compuesta tablaConDragon = new Compuesta("tabla con dragon", "tabla con dragon incrustado");
    tablaConDragon.addPieza(tablaConZocaloDragon);
    tablaConDragon.addPieza(dragon);




    Compuesta skateConDragon = new Compuesta("skate con dragon", "skate con pieza exclusiva de dragon");

    skateConDragon.addPieza(ejeConRuedas);
    skateConDragon.addPieza(ejeConRuedas);
    skateConDragon.addPieza(tablaConDragon);

    System.out.println(skateConDragon.buscar(new tieneColor("dorado")));







  }
}
