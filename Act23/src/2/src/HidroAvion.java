public class HidroAvion extends Vehiculo implements Volador, Acuatico {

    HidroAvion(String nombre) {
        super(nombre);
    }

    @Override
    public void volar() {
        if (nombre == null){
            System.out.println("Error: El nombre es invalido");
            return;
        }
        System.out.println(nombre + " está volando");

    }

    @Override
    public void navegar() {
        if (nombre == null){
            System.out.println("Error: El nombre es invalido");
            return;
        }
        System.out.println(nombre + " está navegando");
    }
}