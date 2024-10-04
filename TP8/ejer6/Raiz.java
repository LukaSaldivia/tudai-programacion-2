public class Raiz extends Operacion {
  public Raiz(Expresion a, Expresion b){
    this.signo = "v^";
    this.a = a;
    this.b = b;
  }

  public double resolver() {

    return Math.pow(b.resolver(), 1/a.resolver());

  }
}
