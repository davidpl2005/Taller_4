package principal.Ejercicio2;

public class Moto extends Vehiculo {

    private int cilindrada;


    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca); 
        this.cilindrada = cilindrada;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}
