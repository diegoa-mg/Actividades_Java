import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base, altura;
        String color;
        int opc;

        System.out.println("Ingrese la base:");
        base = sc.nextDouble();
        sc.nextLine();

        System.out.println("Ingrese la altura:");
        altura = sc.nextDouble();
        sc.nextLine();

        if (base <= 0 | altura <= 0) {
            System.out.println("Error: valores inválidos.");
            return;
        }

        System.out.println("Ingrese el color:");
        color = sc.nextLine();

        Rectangulo rect1 = new Rectangulo(base, altura, color);

        rect1.mostrarInfo();

        do {
            System.out.println("\n --- ¿Qué deseas modificar? ---");
            System.out.println("1. Base");
            System.out.println("2. Altura");
            System.out.println("3. Ambos");
            System.out.println("4. Color");
            System.out.println("5. Salir");
            System.out.println("Ingrese la opcion:");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    System.out.println("Opcion 1");
                    System.out.println("Ingrese la nueva base:");
                    base = sc.nextDouble();
                    if (base <= 0) {
                        System.out.println("Error: valor inválido.");
                        return;
                    }
                    rect1.setBase(base);
                    rect1.mostrarInfo();
                    break;

                case 2:
                    System.out.println("Opcion 2");
                    System.out.println("Ingrese la nueva altura:");
                    altura = sc.nextDouble();
                    if (altura <= 0) {
                        System.out.println("Error: valor inválido.");
                        return;
                    }
                    rect1.setAltura(altura);
                    rect1.mostrarInfo();
                    break;

                case 3:
                    System.out.println("Opcion 3");
                    System.out.println("Ingrese la nueva base:");
                    base = sc.nextDouble();
                    System.out.println("Ingrese la nueva altura:");
                    altura = sc.nextDouble();

                    if (base <= 0 | altura <= 0) {
                        System.out.println("Error: valores inválidos.");
                        return;
                    }

                    rect1.setBase(base);
                    rect1.setAltura(altura);
                    rect1.mostrarInfo();
                    break;

                case 4:
                    System.out.println("Ingrese el nuevo color:");
                    color = sc.nextLine();
                    rect1.setColor(color);
                    rect1.mostrarInfo();
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Error: Opción no válida.");
            }
        } while (opc != 5);

        sc.close();
    }
}