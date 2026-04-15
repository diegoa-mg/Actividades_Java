public class Automovil extends Vehiculo{
    String modelo;

    public Automovil(String marca, String modelo) {
        super(marca);
        this.modelo = modelo;
    }

    public void encenderMotor(){
        System.out.println("El motor del automóvil está\n" +
                "encendido.");
    }
}
