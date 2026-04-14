public class Estudiante extends Persona {
    String matricula;

    public Estudiante(String nombre, int edad, String matricula){
        super(nombre, edad);
        this.matricula = matricula;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Matricula: " + matricula);
    }
}
