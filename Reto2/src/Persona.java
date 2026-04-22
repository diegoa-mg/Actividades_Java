public class Persona {
    String nombre, curp;

    Persona(String nombre, String curp) {
        this.nombre = nombre;
        this.curp = curp;
    }

    void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
        System.out.println("CURP: " + curp);
    }

    void respirar(){
        System.out.println("Respirando...");
    }
}
