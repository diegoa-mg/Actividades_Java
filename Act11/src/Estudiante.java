public class Estudiante {
    String nombre, matricula;
    double[] calificaciones;

    public Estudiante(String nombre, String matricula, double[] calificaciones){
        this.nombre = nombre;
        this.matricula = matricula;
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio(double suma){
        return suma / 7;
    }

    public void mostrarDatos(double promedio){
        System.out.println("Nombre: " + nombre + ", Matrícula: " + matricula + ", Promedio: " + promedio);
    }
}