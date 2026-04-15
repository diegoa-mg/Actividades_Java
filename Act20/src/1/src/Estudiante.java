public class Estudiante extends Persona {
    String matricula;

    public Estudiante(String nombre, int edad, String matricula){
        super(nombre, edad);
        if (!matricula.matches("[a-zA-Z0-9]{6,}") || !Character.isLetter(matricula.charAt(0))) {
            System.out.println("Error: Matrícula inválida.");
            return;
        }
        this.matricula = matricula;
    }

    public void mostrarEstudiante(){
        super.mostrarDatos();
        System.out.println("Matricula: " + matricula);
    }
}
