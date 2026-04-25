public class Mamifero extends Animal{
    int edad;

    Mamifero(String nombre, int edad){
        super(nombre);
        if (edad < 0) {
            System.out.println("Error: La edad es inválida.");
            return;
        }

        this.edad = edad;
    }

    void alimentarse(){
        System.out.println(nombre + " se está alimentando.");
    }
}
