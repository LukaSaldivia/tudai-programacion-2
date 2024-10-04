// En un congreso de Aritmética decidieron utilizar un sistema para organizar sus expresiones 
// matemáticas. Las expresiones con las que trabajan son expresiones básicas, que incluyen 
// suma, resta, producto, división, potencia y raíz.

public class Main {

  public static void main(String[] args) {
    Numero uno = new Numero(1);
    Numero dos = new Numero(2);
    Numero tres = new Numero(3);
    Numero cuatro = new Numero(4);
    Numero cinco = new Numero(5);
    Numero seis = new Numero(6);
    Numero siete = new Numero(7);
    Numero ocho = new Numero(8);
    Numero nueve = new Numero(9);
  
    Suma dosMasTres = new Suma(dos, tres);
    Multiplicacion m1 = new Multiplicacion(dosMasTres, cinco);
  
    m1.consola();



    Suma cincoMasCinco = new Suma(cinco, cinco);
    Resta tresMenosUno = new Resta(tres, uno);

    Potencia p1 = new Potencia(cincoMasCinco, tresMenosUno);

    p1.consola();

    Suma sieteMasOcho = new Suma(siete, ocho);
    Resta cincoMenosTres = new Resta(cinco, tres);
    Division d1 = new Division(sieteMasOcho, cincoMenosTres);

    d1.consola();

    Raiz r1 = new Raiz(dos, cuatro);

    r1.consola();

    Division operacion = new Division(new Suma(new Potencia(dos, tres), cuatro), new Suma(uno, tres));

    operacion.consola();
    
    
    Suma operacion2 = new Suma(new Division(new Suma(nueve, cuatro), new Suma(dos, cinco)), new Multiplicacion(seis, new Resta(tres, uno)));
    
    operacion2.consola();
    
    Multiplicacion operacion3 = new Multiplicacion(operacion, operacion2);
    
    operacion3.consola();

  }
}
