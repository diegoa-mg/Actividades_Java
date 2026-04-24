public class Secretario extends Persona{
    String oficina;

    Secretario(String nombre, int edad, String oficina){
        super(nombre, edad);
        this.oficina = oficina;
    }

    void atender(){
        System.out.println("El secretario atiende en la oficina");
    }
}
