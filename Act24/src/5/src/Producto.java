public class Producto {
    String nombre;

    Producto(String nombre){
        if (nombre == null || nombre.trim().isEmpty()){
            System.out.println("Error: El nombre es invalido.");
            return;
        }
        this.nombre = nombre;
    }

    public void mostrarDetalles(){
        if (nombre == null || nombre.trim().isEmpty()){
            System.out.println("Error: El nombre es invalido.");
            return;
        }
        System.out.println("Nombre: " + nombre);
    }
}
