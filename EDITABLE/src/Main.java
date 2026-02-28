import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String marca, modelo;
        double veloMax, gastoGasPorLitro, distancia;
        int opc;

        System.out.println("Ingresa la marca de tu carro:");
        marca = sc.nextLine();

        System.out.println("Ingresa el modelo de tu " + marca + ":");
        modelo = sc.nextLine();

        System.out.println("Ingresa la velocidad maxima de tu " + modelo + ":");
        veloMax = sc.nextDouble();

        System.out.println("Ingresa el gasto de gasolina por litro de tu " + modelo + ":");
        gastoGasPorLitro = sc.nextDouble();

        Coche Carro1 = new Coche(marca, modelo, veloMax, gastoGasPorLitro);

        System.out.println("\n --- Informacion del Coche ---");
        System.out.println("Marca: " + Carro1.getMarca());
        System.out.println("Modelo: " + Carro1.getModelo());
        System.out.println("Velocidad maxima: " + Carro1.getVelocidadMaxima());
        System.out.println("Gasto de gasolina por litro: " + Carro1.getGastoGasolinaPorLitro());

        do {
            System.out.println("\n --- Menu ---");
            System.out.println("1. Cambiar marca.");
            System.out.println("2. Cambiar modelo.");
            System.out.println("3. Cambiar velocidad maxima.");
            System.out.println("4. Cambiar gasto de gasolina por litro.");
            System.out.println("5. Salir.");
            System.out.println("Elige una opcion:");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc){
                case 1:
                    System.out.println("Ingresa la marca:");
                    marca = sc.nextLine();

                    Carro1.setMarca(marca);
                    break;

                case 2:
                    System.out.println("Ingresa el modelo:");
                    modelo = sc.nextLine();

                    Carro1.setModelo(modelo);
                    break;

                case 3:
                    System.out.println("Ingresa la velocidad maxima:");
                    veloMax = sc.nextDouble();

                    Carro1.setVelocidadMaxima(veloMax);
                    break;

                case 4:
                    System.out.println("Ingresa el gasto de gasolina por litro:");
                    gastoGasPorLitro = sc.nextDouble();

                    Carro1.setGastoGasolinaPorLitro(gastoGasPorLitro);
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Opcion invalida.");
                    break;
            }

        } while (opc != 5);

        System.out.println("\n --- Informacion del Coche Actualizada ---");
        System.out.println("Marca: " + Carro1.getMarca());
        System.out.println("Modelo: " + Carro1.getModelo());
        System.out.println("Velocidad maxima: " + Carro1.getVelocidadMaxima());
        System.out.println("Gasto de gasolina por litro: " + Carro1.getGastoGasolinaPorLitro());

        System.out.println("\nIngresa la distancia recorrida en km:");
        distancia = sc.nextDouble();

        System.out.println("Gasto de gasolina: " + Carro1.calcularGastoDeGasolina(distancia));

        sc.close();
    }
}