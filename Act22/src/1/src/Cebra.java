public class Cebra extends Animal {
    int rayas;

    Cebra(String nombre, int edad, int rayas){
        super(nombre, edad);
        this.rayas = rayas;
    }

    void correr(){
        System.out.println("La cebra corre rápidamente");
    }
}
