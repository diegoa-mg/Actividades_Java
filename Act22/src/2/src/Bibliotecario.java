public class Bibliotecario extends Persona {
    String turno;

    Bibliotecario(String nombre, int edad, String turno){
        super(nombre, edad);
        this.turno = turno;
    }

    void prestarLibro(){
        System.out.println("Libro prestado al alumno");
    }
}
