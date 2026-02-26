import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String marca, modelo;
        double veloMax, gastoGasPorLitro, distancia;
        double precioPorLitro = 23.57;
        int opc;

        System.out.println("Ingresa la marca de tu carro:");
        marca = sc.nextLine();

        System.out.println("Ingresa el modelo de tu " + marca + ":");
        modelo = sc.nextLine();

        System.out.println("Ingresa la velocidad máxima de tu " + modelo + ":");
        veloMax = sc.nextDouble();

        System.out.println("Ingresa el gasto de gasolina por litro de tu " + modelo +":");
        gastoGasPorLitro = sc.nextDouble();

        Automovil Carro1 = new Automovil(marca, modelo, veloMax, gastoGasPorLitro);

        Carro1.mostrarInformacion();

        do{
            System.out.println("\n --- Menú ---");
            System.out.println("1. Cambiar marca.");
            System.out.println("2. Cambiar modelo.");
            System.out.println("3. Cambiar velocidad máxima.");
            System.out.println("4. Cambiar gasto de gasolina por litro.");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opc = sc.nextInt();
            sc.nextLine(); // Para eliminar el bug

            switch (opc) {
                case 1:
                    System.out.println("Ingresa la marca: ");
                    marca = sc.nextLine();

                    Carro1.setMarca(marca);
                    break;

                case 2:
                    System.out.println("Ingresa el modelo: ");
                    modelo = sc.nextLine();

                    Carro1.setModelo(modelo);
                    break;

                case 3:
                    System.out.println("Ingresa la velocidad máxima: ");
                    veloMax = sc.nextDouble();

                    Carro1.setVelocidadMaxima(veloMax);
                    break;

                case 4:
                    System.out.println("Ingresa el gasto por gasolina: ");
                    gastoGasPorLitro = sc.nextDouble();

                    Carro1.setGastoGasolinaPorLitro(gastoGasPorLitro);
                    break;

                case 5:

                    break;

                default:

                    break;
            }

        }while (opc != 5);

        Carro1.mostrarInformacion();

        System.out.println("\nIngresa la distancia recorrida en km:");
        distancia = sc.nextDouble();

        System.out.println("Gasto de Gasolina: " + Carro1.calcularGastoDeGasolina(distancia, precioPorLitro));

        sc.close();
    }
}