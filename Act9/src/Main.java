import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la base del rectangulo:");
        double base = sc.nextDouble();

        System.out.println("Ingresa la altura del rectangulo:");
        double altura = sc.nextDouble();

        Rectangulo Rectangulo1 = new Rectangulo(base, altura);

        if (base < 0 || altura < 0){
            System.out.println("Error: Numeros menores a cero.");
            return;
        }


        System.out.println("El area es: " + Rectangulo1.calcularArea());
        System.out.println("El perimetro es: " + Rectangulo1.calcularPerimetro());

        sc.close();
    }
}