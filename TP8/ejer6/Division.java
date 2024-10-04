public class Division extends Operacion {
  public Division(Expresion a, Expresion b){
    this.signo = "/";
    this.a = a;
    this.b = b;
  }

  public double resolver() {

    return a.resolver() / b.resolver();

  }
}
