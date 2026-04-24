import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double altura, base;

        System.out.println("Ingresa la base del triangulo:");
        base = sc.nextDouble();

        while (base < 0 || base > 100){
            System.out.println("Error: El valor debe ser mayor a 0 y menor a 100. Intente de nuevo.");
            System.out.println("Ingresa la base del triangulo:");
            base = sc.nextDouble();
        }

        System.out.println("Ingresa la altura del triangulo:");
        altura = sc.nextDouble();

        while (altura < 0 || altura > 100){
            System.out.println("Error: El valor debe ser mayor a 0 y menor a 100. Intente de nuevo.");
            System.out.println("Ingresa la altura del triangulo:");
            altura = sc.nextDouble();
        }

        Triangulo tri1 = new Triangulo("Triangulo", 3, base, altura);

        tri1.mostrarNombre();
        tri1.mostrarLados();
        System.out.println("Base = " + base);
        System.out.println("Altura = " + altura);
        System.out.println("Area = " + tri1.calcularArea());

        sc.close();
    }
}