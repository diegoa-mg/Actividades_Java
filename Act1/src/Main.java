import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        int edad;
        double altura;
        char estado_civil;
        boolean mayor_de_edad = false;

        System.out.print("Ingrese su nombre completo: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();

        if (edad >= 18)
            mayor_de_edad = true;

        System.out.print("Ingrese su altura en metros: ");
        altura = sc.nextDouble();

        System.out.print("Ingrese su estado civil (S: Soltero, C: Casado, D: Divorciado): ");
        estado_civil = sc.next().charAt(0);

        // Mostrar resultados
        System.out.println("\n--- Resumen de Datos ---");
        System.out.println("Nombre completo: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + "m");

        if (estado_civil == 'S' || estado_civil == 's') {
            System.out.println("Estado Civil: Soltero");
        }
        else if (estado_civil == 'C' || estado_civil == 'c') {
            System.out.println("Estado Civil: Casado");
        }
        else {
            System.out.println("Estado Civil: Divorciado");
        }

        if (mayor_de_edad) { // mayor_de_edad == true
            System.out.println("Es mayor de edad: Si");
        }
        else {
            System.out.println("Es mayor de edad: No");
        }

        sc.close();
    }
}