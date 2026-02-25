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
        if (promedio == 10) {
            System.out.println("Si tú sabes lo que vales, ve y consigue lo que mereces.");
        }
        else if (promedio >= 8) {
            System.out.println("Excelente.");
        }
        else if (promedio >= 6){
            System.out.println("Intenta mejorar el siguiente semestre.");
        }
        else {
            for (int i = 1; i <= 10; i++){
                System.out.println("Necesito ponerme a estudiar más.");
            }
        }
    }
}