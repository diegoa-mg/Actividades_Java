public class Smartphone extends Dispositivo implements Movil, Computadora{
    Smartphone(String marca, String modelo){
        super(marca, modelo);
    }

    @Override
    public void realizarLlamada() {
        if (marca.trim().isEmpty()){
            System.out.println("Error: Marca inválida.");
            return;
        }
        if (modelo.trim().isEmpty()){
            System.out.println("Error: Modelo inválida.");
            return;
        }
        System.out.println(marca + " " + modelo + " está realizando una llamada.");
    }

    @Override
    public void ejecutarPrograma() {
        if (marca.trim().isEmpty()){
            System.out.println("Error: Marca vacía.");
            return;
        }
        if (modelo.trim().isEmpty()){
            System.out.println("Error: Modelo vacío.");
            return;
        }
        System.out.println(marca + " " + modelo + " está ejecutando un programa.");
    }
}
