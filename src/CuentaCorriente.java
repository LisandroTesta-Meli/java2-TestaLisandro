public class CuentaCorriente {
    String titulas = "";
    int numeroCuenta = 0;
    double  saldo = 0;
    public CuentaCorriente(CuentaCorriente cn){
        titulas = cn.titulas;
        numeroCuenta = cn.numeroCuenta;
        saldo = cn.saldo;
    }

    public void ingreso(double s){
    saldo += s;
    }
    public void egreso(double s){
        saldo -= s;
    }
    public  void reintegro(double s){
         ingreso(s);
    }
    public  void transferencia(int tipo , double s){
       if(tipo == 1){
           ingreso(s);
       }
       else if (tipo == 2){
           egreso(s);
       }
       else{
           System.out.println("El tipo de trasnferencia ingresado no es valido");
           System.out.println("Ingrese 1 para realizar un ingreso y 2 para realizar un egreso de saldo");
       }

    }

    public CuentaCorriente() {
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitulas() {
        return titulas;
    }

    public void setTitulas(String titulas) {
        this.titulas = titulas;
    }
}
