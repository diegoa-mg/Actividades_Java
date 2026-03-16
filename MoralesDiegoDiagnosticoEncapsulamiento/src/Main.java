import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char opc;
        int opc2;

        System.out.println("Ingresa la marca de tu carro:");
        String marca = sc.nextLine();

        System.out.println("Ingresa el modelo de tu carro:");
        String modelo = sc.nextLine();

        System.out.println("Ingresa la velocidad maxima de tu carro:");
        double veloMax = sc.nextDouble();

        System.out.println("Ingresa el gasto de gasolina por litro de tu carro:");
        double gastoGasolina = sc.nextDouble();

        Coche carro1 = new Coche(marca, modelo, veloMax, gastoGasolina);

        System.out.println("\n --- Informacion del Coche ---");
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Velocidad Maxima: " + carro1.getVelocidadMaxima());
        System.out.println("Gasto de Gasolina por Litro: " + carro1.getGastoGasolinaPorLitro());

        System.out.println("\nTe gustaria cambiar algun dato del carro?");
        opc = sc.next().charAt(0);

        if(opc == 's' || opc == 'S') {
            System.out.println("\n --- Opciones ---");
            System.out.println("1. Cambiar marca.");
            System.out.println("2. Cambiar modelo.");
            System.out.println("3. Cambiar velocidad maxima.");
            System.out.println("4. Cambiar gasto de gasolina por litro.");
            opc2 = sc.nextInt();
            sc.nextLine();

            switch (opc2) {
                case 1:
                    System.out.println("Ingresa la nueva marca:");
                    marca = sc.nextLine();
                    carro1.setMarca(marca);

                    break;

                case 2:
                    System.out.println("Ingresa el nuevo modelo:");
                    modelo = sc.nextLine();
                    carro1.setModelo(modelo);

                    break;

                case 3:
                    System.out.println("Ingresa la nueva velocidad maxima:");
                    veloMax = sc.nextDouble();
                    carro1.setVelocidadMaxima(veloMax);

                    break;

                case 4:
                    System.out.println("Ingresa el nuevo modelo:");
                    gastoGasolina = sc.nextDouble();
                    carro1.setGastoGasolinaPorLitro(gastoGasolina);

                    break;
            }
        }

        System.out.println("\n --- Informacion del Coche Actualizada ---");
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Velocidad Maxima: " + carro1.getVelocidadMaxima());
        System.out.println("Gasto de Gasolina por Litro: " + carro1.getGastoGasolinaPorLitro());

        System.out.println("\nIngresa la distancia recorrida:");
        double distancia = sc.nextDouble();

        System.out.println("Distancia recorrida: " + carro1.calcularGastoGasolina(distancia));

        sc.close();
    }
}