public class Coordinador extends Persona{
    String departamento;

    Coordinador(String nombre, int edad, String departamento){
        super(nombre, edad);
        this.departamento = departamento;
    }

    void coordinar(){
        System.out.println("El coordinador organiza actividades");
    }
}
