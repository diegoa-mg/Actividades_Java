import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Ingresa el radio del cilindro: ");
            double radio = sc.nextInt();

            System.out.print("Ingresa la altura del cilindro: ");
            double altura = sc.nextInt();

            if (radio <= 0 || altura <= 0) {
                System.out.println("Error: Altura o radio invalido.");
                return;
            }

            double pi = 3.1416;
            double area = 2 * pi * radio * (radio + altura);

            System.out.println("\n--- Datos Ingresados ---");
            System.out.println("Radio: " + radio);
            System.out.println("Altura: " + altura);
            System.out.println("\n--- Cálculo del Área Total ---");
            System.out.println("Área total del cilindro: " + String.format("%.2f", area));
            System.out.printf("Área total del cilindro: %.2f%n", area);

        }
    }