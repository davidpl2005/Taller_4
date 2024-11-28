package principal.Ejercicio3;



import principal.Ejercicio2.Moto;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Banco banco = new Banco(1000.0);
        banco.depositar(500.0);
        banco.retirar(200.0);
        
        System.out.println("Saldo final: " + banco.obtenerSaldo());

     
        
        Moto moto = new Moto("Moto", "Yamaha", 250);
        moto.mostrarInformacion();
        
        System.out.println(banco.saldo);
    }
}
