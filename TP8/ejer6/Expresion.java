import java.util.ArrayList;

public abstract class Expresion {


  public abstract double resolver();
  public abstract ArrayList<Double> numeros();
  public abstract ArrayList<String> signos();
  public abstract String mostrar();

  public void consola(){
    System.out.println(this.mostrar() + " = "+ this.resolver());
    System.out.println(this.numeros());
    System.out.println(this.signos());
    System.out.println();
  }
  
}