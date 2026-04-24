public class Estudiante extends Persona{
    int matricula;

    Estudiante(String nombre, String curp, int matricula) {
        super(nombre, curp); // Llama al constructor del padre this.matricula = matricula;
        this.matricula = matricula;
    }

    void mostrarDatos() {
        System.out.println("Matrícula: " + matricula);
    }
}
