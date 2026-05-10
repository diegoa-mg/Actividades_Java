import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado, base, altura, radio;
        int opc;

        Figura figura = null;

        do {
            System.out.println("\n --- MENU DE FIGURAS ---");
            System.out.println("1. Cuadrado");
            System.out.println("2. Triángulo");
            System.out.println("3. Círculo");
            System.out.println("0. Salir");
            System.out.println("Elige una figura:");
            opc = sc.nextInt();
            sc.nextLine();

            if (opc > 3 || opc < 0){
                System.out.println("Error: opción inválida. Intenta de nuevo.");
            }
            else {
                switch (opc){
                    case 1:
                        System.out.println("\n === CUADRADO ===");
                        for (int i = 1; i <= 3; i++){
                            System.out.println("Ingresa el lado:");
                            lado = sc.nextDouble();
                            sc.nextLine();

                            if (lado > 0){
                                figura = new Cuadrado("Cuadrado", lado);
                                figura.mostrarNombre();
                                System.out.println("Área: " + figura.calcularArea());
                                break;
                            }

                            System.out.println("Error: Lado inválido. Intenta de nuevo");
                        }
                        break;

                    case 2:
                        System.out.println("\n === TRIANGULO ===");
                        for (int i = 1; i <= 3; i++){
                            System.out.println("Ingresa la base:");
                            base = sc.nextDouble();
                            sc.nextLine();
                            System.out.println("Ingresa la altura:");
                            altura = sc.nextDouble();
                            sc.nextLine();

                            if (base > 0 && altura > 0){
                                figura = new Triangulo("Triangulo", base, altura);
                                figura.mostrarNombre();
                                System.out.println("Área: " + figura.calcularArea());
                                break;
                            }

                            System.out.println("Error: Lado inválido. Intenta de nuevo");
                        }
                        break;

                    case 3:
                        System.out.println("\n === CIRCULO ===");
                        for (int i = 1; i <= 3; i++){
                            System.out.println("Ingresa el radio:");
                            radio = sc.nextDouble();
                            sc.nextLine();

                            if (radio > 0){
                                figura = new Circulo("Circulo", radio);
                                figura.mostrarNombre();
                                System.out.println("Área: " + figura.calcularArea());
                                break;
                            }

                            System.out.println("Error: Lado inválido. Intenta de nuevo");
                        }
                        break;

                    case 0:
                        System.out.println("Saliendo del programa...");
                        break;
                }
            }
        }while (opc != 0);

        sc.close();
    }
}