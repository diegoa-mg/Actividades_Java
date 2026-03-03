import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la base del rectangulo:");
        double base = sc.nextDouble();

        System.out.println("Ingresa la altura del rectangulo:");
        double altura = sc.nextDouble();

        if (base < 0 || altura < 0){
            System.out.println("Error. Numeros negativos.");
            return;
        }

        Rectangulo rect1 = new Rectangulo(base, altura);

        System.out.println("Area: " + rect1.calcularArea());
        System.out.println("Perimetro: " + rect1.calcularPerimetro());
    }
}