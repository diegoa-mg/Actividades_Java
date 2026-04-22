public class Secretaria extends Persona{
    String carreraEncargada;

    public Secretaria(String nombre, String curp, String carreraEncargada){
        super(nombre, curp);
        this.carreraEncargada = carreraEncargada;
    }

    void mostrarSecretaria(){
        System.out.println("Carrera: " + carreraEncargada);
    }
}
