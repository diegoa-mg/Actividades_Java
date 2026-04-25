public class Animal {
    String nombre;

    Animal(String nombre){
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Error: El nombre no puede estar vacío.");
            return;
        }
        this.nombre = nombre;
    }

    void hacerSonido(){
        System.out.println(nombre + " está haciendo un sonido.");
    }
}
