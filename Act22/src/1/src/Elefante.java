public class Elefante extends Animal{
    double peso;

    Elefante(String nombre, int edad, double peso){
        super(nombre, edad);
        this.peso = peso;
    }

    void usarTrompa(){
        System.out.println("El elefante usa su trompa");
    }
}
