public class Vehiculo {
    String nombre;

    Vehiculo(String nombre){
        if (nombre.trim().isEmpty() || nombre == null){
            System.out.println("Error: El nombre esta vacío");
            return;
        }
        this.nombre = nombre;
    }

    void moverse(){
        if (nombre == null){
            System.out.println("Error: El nombre es invalido");
            return;
        }
        System.out.println(nombre + " se está moviendo");
    }
}
