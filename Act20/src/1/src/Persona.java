public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad){
        if (nombre.length() < 3 || !nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚ ]+")){
            System.out.println("Error: Nombre muy corto o con números.");
            return;
        }
        if (edad < 6 || edad > 100){
            System.out.println("Error: Edad invalida (6-100)");
            return;
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
