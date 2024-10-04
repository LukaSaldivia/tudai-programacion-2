import java.util.ArrayList;

public abstract class Operacion extends Expresion {
  protected Expresion a;
  protected Expresion b;

  protected String signo;

  public ArrayList<Double> numeros(){
    ArrayList<Double> res = new ArrayList<Double>();

    res.addAll(a.numeros());
    res.addAll(b.numeros());

    return res;
  }

  public ArrayList<String> signos(){
    ArrayList<String> res = new ArrayList<String>();

    res.addAll(a.signos());
    res.addAll(b.signos());
    res.add(signo);

    return res;
  }

  public String mostrar(){
    return "(" + a.mostrar() + " " + signo + " " + b.mostrar() + ")";
  }

}
