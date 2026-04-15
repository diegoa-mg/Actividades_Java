public class Vehiculo {
    String modelo;

    public Vehiculo(String modelo){
        if (modelo.trim().isEmpty()){
            System.out.println("Error: El modelo no puede estar vacío ni contener solo espacios.");
            return;
        }
        this.modelo = modelo;
    }

    public void encender(){
        System.out.println("Encendiendo...");
    }
}
