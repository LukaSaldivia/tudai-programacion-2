public class Main {

  public static void main(String[] args) {
    Numero uno = new Numero(1);
    Numero dos = new Numero(2);
    Numero tres = new Numero(3);
    Numero cinco = new Numero(5);
    Numero siete = new Numero(7);
    Numero ocho = new Numero(8);
  
    Suma dosMasTres = new Suma(dos, tres);
    Multiplicacion m1 = new Multiplicacion(dosMasTres, cinco);
  
    System.out.println(m1.mostrar() + " = "+ m1.resolver());
    System.out.println(m1.numeros());
    System.out.println(m1.signos());
    System.out.println();



    Suma cincoMasCinco = new Suma(cinco, cinco);
    Resta tresMenosUno = new Resta(tres, uno);

    Potencia p1 = new Potencia(cincoMasCinco, tresMenosUno);

    System.out.println(p1.mostrar() + " = "+ p1.resolver());
    System.out.println(p1.numeros());
    System.out.println(p1.signos());
    System.out.println();

    Suma sieteMasOcho = new Suma(siete, ocho);
    Resta cincoMenosTres = new Resta(cinco, tres);
    Division d1 = new Division(sieteMasOcho, cincoMenosTres);

    System.out.println(d1.mostrar() + " = "+ d1.resolver());
    System.out.println(d1.numeros());
    System.out.println(d1.signos());
    System.out.println();


    
  }
}
