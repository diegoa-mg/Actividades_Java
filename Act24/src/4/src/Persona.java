public class Persona {
    String nombre;
    int edad;

    Persona(String nombre, int edad){
        if (nombre == null || edad < 0){
            System.out.println("Error: Valores inválidos");
            return;
        }
        this.nombre = nombre;
        this.edad = edad;
    }
}
