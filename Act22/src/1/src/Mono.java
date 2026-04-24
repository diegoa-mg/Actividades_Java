public class Mono extends Animal{
    String tipo;

    Mono(String nombre, int edad, String tipo){
        super(nombre,edad);
        this.tipo = tipo;
    }

    void trepar(){
        System.out.println("El mono trepa árboles");
    }
}
