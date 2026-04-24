public class Leon extends Animal{
    boolean manada;

    Leon(String nombre, int edad, boolean manada){
        super(nombre, edad);
        this.manada = manada;
    }

    void rugir(){
        System.out.println("¡Rooaaaar!");
    }
}
