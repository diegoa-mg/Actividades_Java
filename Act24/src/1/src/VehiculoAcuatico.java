public class VehiculoAcuatico extends Vehiculo implements Acuatico{
    VehiculoAcuatico(String modelo){
        super(modelo);
    }

    @Override
    public void navegar() {
        System.out.println(modelo + " está navegando");
    }
}
