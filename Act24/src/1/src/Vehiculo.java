public class Vehiculo {
    String modelo;

    Vehiculo(String modelo){
        this.modelo = modelo;
    }

    void mover(){
        System.out.println(modelo + " se esta moviendo");
    }
}
