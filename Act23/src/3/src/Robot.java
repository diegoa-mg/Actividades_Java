public class Robot implements Cocinero, Limpiador, Mensajero {
    String nombre;

    Robot(String nombre){
        if (nombre == null || nombre.trim().isEmpty()){
            System.out.println("Error: EL nombre está vacío.");
        }
        this.nombre = nombre;
    }

    @Override
    public void cocinar() {
        if (nombre == null){
            System.out.println("Error: El nombre es inválido.");
        }
        System.out.println(nombre + " está cocinando.");
    }

    @Override
    public void limpiar() {
        if (nombre == null){
            System.out.println("Error: El nombre es inválido.");
        }
        System.out.println(nombre + " está limpiando.");
    }

    @Override
    public void entregarMensajes() {
        if (nombre == null){
            System.out.println("Error: El nombre es inválido.");
        }
        System.out.println(nombre + " está entregando mensajes.");
    }
}
