public class VehiculoHibrido extends VehiculoAcuatico{
    VehiculoHibrido(String modelo){
        super(modelo);
    }

    void flotar(){
        System.out.printf(modelo + " está flotando");
    }
}
