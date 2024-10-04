import java.util.ArrayList;

public class Numero extends Expresion{
  private double valor;

  public Numero(double valor){
    this.valor = valor;
  }

  public double resolver(){
    return valor;
  }

  public ArrayList<Double> numeros(){
    ArrayList<Double> n = new ArrayList<Double>();
    n.add(valor);

    return n;
  }

  public ArrayList<String> signos(){
    ArrayList<String> res = new ArrayList<String>();

    return res;
  }

  public String mostrar(){
    return String.valueOf(valor);
  }
}
