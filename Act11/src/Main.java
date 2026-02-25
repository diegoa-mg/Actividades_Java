import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, matricula;
        double promedio, suma = 0;
        double[] calificaciones = new double[7]; // Inicializar un array

        System.out.println("Ingresa tu nombre:");
        nombre = sc.nextLine();

        System.out.println("Ingresa tu matrícula:");
        matricula = sc.nextLine();

        for (int i = 0; i < 7; i++){
            System.out.println("Ingresa la calificación " + (i + 1) + ": ");
            calificaciones[i] = sc.nextDouble();

            if(calificaciones[i] < 0 || calificaciones[i] > 10){
                System.out.println("Error. Calificación invalida.");
                return;
            }
            suma += calificaciones[i];
        }

        Estudiante Estudiante1 = new Estudiante(nombre, matricula, calificaciones);

        promedio = Estudiante1.calcularPromedio(suma);
        Estudiante1.mostrarDatos(promedio);

        sc.close();
    }
}