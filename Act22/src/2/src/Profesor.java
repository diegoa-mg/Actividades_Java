public class Profesor extends Persona{
    String materia;

    Profesor(String nombre, int edad, String materia){
        super(nombre, edad);
        this.materia = materia;
    }

    void darClase(){
        System.out.println("El profesor está dando clase");
    }
}
