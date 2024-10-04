public class Potencia extends Operacion {
  public Potencia(Expresion a, Expresion b){
    this.signo = "^";
    this.a = a;
    this.b = b;
  }

  public double resolver() {

    return Math.pow(a.resolver(), b.resolver());

  }
}
