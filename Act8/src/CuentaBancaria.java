public class CuentaBancaria {
    String titular, numeroCuenta;
    double saldo;

    public CuentaBancaria(String titular, String numeroCuenta, double saldo){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public double depositar(double cantidad){
        return saldo += cantidad;
    }

    public double retirar(double cantidad){
        return saldo -= cantidad;
    }

    public void mostrarSaldo(){
        System.out.println("Saldo: " + saldo + " pesos.");
    }
}
