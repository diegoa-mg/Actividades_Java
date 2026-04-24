public class Animal {
    String nombre;
    int edad;

    Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void hacerSonido(){
        System.out.println("El animal hace un sonido.");
    }
}
