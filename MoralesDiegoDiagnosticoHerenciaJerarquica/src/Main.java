import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opc;
        Triangulo tri1 = new Triangulo("Triangulo", 0, 0);
        Rectangulo rec1 = new Rectangulo("Rectangulo", 0, 0);

        do{
            System.out.println("\n === Menu ===");
            System.out.println("1. Triangulo");
            System.out.println("2. Rectangulo");
            System.out.println("0. Salir");
            System.out.println("Seleccione una opcion: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc){
                case 1:
                    System.out.println("\n === Triangulo ===");
                    System.out.println("Ingresa el valor de la base:");
                    tri1.base = sc.nextDouble();

                    System.out.println("Ingresa el valor de la altura:");
                    tri1.altura = sc.nextDouble();

                    while(tri1.base > 100 || tri1.base < 0 || tri1.altura > 100 || tri1.altura < 0){
                        System.out.println("Error: el valor debe ser mayor a 0 y menor a 100. Intente de nuevo.");

                        System.out.println("Ingresa el valor de la base:");
                        tri1.base = sc.nextDouble();

                        System.out.println("Ingresa el valor de la altura:");
                        tri1.altura = sc.nextDouble();
                    }

                    System.out.println("\nFigura: " + tri1.nombre);
                    System.out.println("Base: " + tri1.base);
                    System.out.println("Altura: " + tri1.altura);
                    System.out.println("Area: " + tri1.calcularArea());

                    break;

                case 2:
                    System.out.println("\n === Rectangulo ===");
                    System.out.println("Ingresa el valor de la base:");
                    rec1.base = sc.nextDouble();

                    System.out.println("Ingresa el valor de la altura:");
                    rec1.altura = sc.nextDouble();

                    while(rec1.base > 100 || rec1.base < 0 || rec1.altura > 100 || rec1.altura < 0){
                        System.out.println("Error: el valor debe ser mayor a 0 y menor a 100. Intente de nuevo.");

                        System.out.println("Ingresa el valor de la base:");
                        rec1.base = sc.nextDouble();

                        System.out.println("Ingresa el valor de la altura:");
                        rec1.altura = sc.nextDouble();
                    }

                    System.out.println("\nFigura: " + rec1.nombre);
                    System.out.println("Base: " + rec1.base);
                    System.out.println("Altura: " + rec1.altura);
                    System.out.println("Area: " + rec1.calcularArea());

                    break;

                case 0:
                    System.out.println("\nSaliendo...");
                    break;

                default:
                    System.out.println("\nError: opcion invalida.");
                    break;
            }
        }while(opc != 0);




        sc.close();
    }
}