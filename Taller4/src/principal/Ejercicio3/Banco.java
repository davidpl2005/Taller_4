package principal.Ejercicio3;

public class Banco {

    protected double saldo;  // No es seguro

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public double obtenerSaldo() {
        return saldo;
    }
}