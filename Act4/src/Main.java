import java.util.Scanner; // Biblioteca para scan

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declarar variables
        double suma = 0.0, promedio, calif = 0.0;

        // Bucle para pedir las calificaciones
        for (int i = 1; i <= 5; i++){
            // Pedir calificaciones
            System.out.print("Ingrese la calificación del parcial " + i + ": ");
            calif = sc.nextDouble();

            // Comprobar si una calificacion es 0
            if (calif <= 0){
                System.out.println("Necesitas recursar el semestre.");
            }

            // Sumar las calificaciones
            suma += calif;
        }

        // Sacar promedio
        promedio = suma / 5;

        // Mostrar resultados
        System.out.println("\n --- Resultados ---");
        System.out.printf("Promedio: %.2f%n", promedio); // %n = inserta un salto de linea

        if (promedio < 6){
            System.out.println("No aprobaste la materia.");
        }
        else{
            System.out.println("Aprobaste la materia.");
        }

        sc.close();
    }
}