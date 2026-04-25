public class Dispositivo {
    String marca, modelo;

    Dispositivo(String marca, String modelo){
        if (marca == null){
            System.out.println("Error: Marca inválida.");
            return;
        }
        if (modelo == null){
            System.out.println("Error: Modelo inválida.");
            return;
        }
        this.marca = marca;
        this.modelo = modelo;
    }

    void encender(){
        if (marca.trim().isEmpty()){
            System.out.println("Error: Marca vacía.");
            return;
        }
        if (modelo.trim().isEmpty()){
            System.out.println("Error: Modelo vacío.");
            return;
        }
        System.out.println(marca + " " + modelo + " se está encendiendo.");
    }
}
