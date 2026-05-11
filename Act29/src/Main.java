import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declarar variables
        int opc, accion;
        double potenciaMotor, consumoLitro, consumoPorTonelada, peso, distancia;

        // Crear el objeto vacio
        Vehiculo vehiculo1 = null;

        do {
            // Menu principal
            System.out.println("\n --- MENÚ DE VEHÍCULOS ---");
            System.out.println("1. Coche");
            System.out.println("2. Camión");
            System.out.println("3. Motocicleta");
            System.out.println("0. Salir");
            System.out.println("Selecciona un vehículo:");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc){
                case 1: // COCHE
                    System.out.println("\n --- COCHE ---");
                    // Ingresar los valores
                    System.out.println("Ingresa el consumo por litro del coche:");
                    consumoLitro = sc.nextDouble();
                    sc.nextLine();

                    // Validar consumo por litro
                    if (consumoLitro <= 0){
                        for (int i = 1; i <= 3; i++){
                            System.out.println("Error: valor inválido. Intenta de nuevo.");
                            System.out.println("Ingresa el consumo por litro del coche:");
                            consumoLitro = sc.nextDouble();
                            sc.nextLine();

                            if (consumoLitro > 0){ // Si el usuario ingresa un valor valido, sale del bucle
                                break;
                            }
                        }
                        if (consumoLitro <= 0){ // Si despues de los 3 intentos, el valor sigue siendo invalido, regresa al menu principal
                            System.out.println("\nLímite de intentos. Regresando al menú principal...");
                            break;
                        }
                    }

                    System.out.println("Ingresa la potencia del motor en caballos de fuerza:");
                    potenciaMotor = sc.nextDouble();
                    sc.nextLine();

                    // Validar potencia del motor
                    if (potenciaMotor <= 0){
                        for (int i = 1; i <= 3; i++){
                            System.out.println("Error: valor inválido. Intenta de nuevo.");
                            System.out.println("Ingresa la potencia del motor en caballos de fuerza:");
                            potenciaMotor = sc.nextDouble();
                            sc.nextLine();

                            if (potenciaMotor > 0){ // Si el usuario ingresa un valor valido, sale del bucle
                                break;
                            }
                        }
                        if (potenciaMotor <= 0){ // Si despues de los 3 intentos, el valor sigue siendo invalido, regresa al menu principal
                            System.out.println("\nLímite de intentos. Regresando al menú principal...");
                            break;
                        }
                    }

                    System.out.println("Ingresa la distancia recorrida:");
                    distancia = sc.nextDouble();
                    sc.nextLine();

                    // Validar distancia
                    if (distancia <= 0){
                        for (int i = 1; i <= 3; i++){
                            System.out.println("Error: valor inválido. Intenta de nuevo.");
                            System.out.println("Ingresa la distancia recorrida:");
                            distancia = sc.nextDouble();
                            sc.nextLine();

                            if (distancia > 0){ // Si el usuario ingresa un valor valido, sale del bucle
                                break;
                            }
                        }
                        if (distancia <= 0){ // Si despues de los 3 intentos, el valor sigue siendo invalido, regresa al menu principal
                            System.out.println("\nLímite de intentos. Regresando al menú principal...");
                            break;
                        }
                    }

                    // Instanciar objeto
                    vehiculo1 = new Coche("Coche", consumoLitro, potenciaMotor, distancia);

                    // Mostrar informacion
                    ((Coche)vehiculo1).mostrarNombre();
                    System.out.println("\nConsumo por litro: " + ((Coche)vehiculo1).getConsumoLitro()); // Cast
                    System.out.println("Potencia del motor: " + ((Coche)vehiculo1).getPotenciaMotor());
                    System.out.println("Distancia: " + ((Coche)vehiculo1).getDistancia());
                    System.out.println("Consumo total: " + ((Coche)vehiculo1).calcularConsumo());
                    System.out.println("Velocidad máxima: " + ((Coche)vehiculo1).calcularVelocidadMaxima());

                    // Cambio en atributos
                    do {
                        System.out.println("\n¿Deseas realizar una acción con los atributos? (1: Get, 2: Set, 0: Volver al menú principal):");
                        accion = sc.nextInt();
                        sc.nextLine();

                        switch (accion){
                            case 1: // Get
                                ((Coche)vehiculo1).mostrarNombre();
                                System.out.println("\nConsumo por litro: " + ((Coche)vehiculo1).getConsumoLitro());
                                System.out.println("Potencia del motor: " + ((Coche)vehiculo1).getPotenciaMotor());
                                System.out.println("Distancia: " + ((Coche)vehiculo1).getDistancia());
                                System.out.println("Consumo total: " + ((Coche)vehiculo1).calcularConsumo());
                                System.out.println("Velocidad máxima: " + ((Coche)vehiculo1).calcularVelocidadMaxima());

                                System.out.println("\nDeseas realizar otra acción? (1: Si, 0: No):");
                                accion = sc.nextInt(); // Se usa la misma variable accion para poder salir del bucle en caso de querer salir
                                sc.nextLine();
                                break;

                            case 2: // Set
                                // Ingresar nuevos valores
                                System.out.println("\nIngresa el nuevo nombre del coche:");
                                ((Coche)vehiculo1).setNombre(sc.nextLine());
                                System.out.println("Ingresa el nuevo consumo por litro del coche:");
                                ((Coche)vehiculo1).setConsumoLitro(sc.nextDouble());
                                sc.nextLine();
                                System.out.println("Ingresa la nueva potencia del motor:");
                                ((Coche)vehiculo1).setPotenciaMotor(sc.nextDouble());
                                sc.nextLine();
                                System.out.println("Ingresa la nueva distancia recorrida:");
                                ((Coche)vehiculo1).setDistancia(sc.nextDouble());
                                sc.nextLine();

                                // Mostrar informacion actualizada
                                ((Coche)vehiculo1).mostrarNombre();
                                System.out.println("\nNuevo consumo por litro: " + ((Coche)vehiculo1).getConsumoLitro());
                                System.out.println("Nueva potencia del motor: " + ((Coche)vehiculo1).getPotenciaMotor());
                                System.out.println("Nueva distancia: " + ((Coche)vehiculo1).getDistancia());
                                System.out.println("Nuevo consumo total: " + ((Coche)vehiculo1).calcularConsumo());
                                System.out.println("Nueva velocidad máxima: " + ((Coche)vehiculo1).calcularVelocidadMaxima());

                                System.out.println("\nDeseas realizar otra acción? (1: Si, 0: No):");
                                accion = sc.nextInt(); // Se usa la misma variable accion para poder salir del bucle en caso de querer salir
                                sc.nextLine();
                                break;

                            case 0:
                                System.out.println("\nRegresando al menú principal...");
                                break;

                            default:
                                System.out.println("\nError: Opción inválida.");
                        }
                    }while (accion != 0);
                    break;

                case 2: // CAMION
                    System.out.println("\n --- CAMION ---");
                    // Ingresar los valores
                    System.out.println("Ingresa el consumo por tonelada del camion:");
                    consumoPorTonelada = sc.nextDouble();
                    sc.nextLine();

                    // Validar consumo por tonelada
                    if (consumoPorTonelada <= 0){
                        for (int i = 1; i <= 3; i++){
                            System.out.println("Error: valor inválido. Intenta de nuevo.");
                            System.out.println("Ingresa el consumo por tonelada del coche:");
                            consumoPorTonelada = sc.nextDouble();
                            sc.nextLine();

                            if (consumoPorTonelada > 0){ // Si el usuario ingresa un valor valido, sale del bucle
                                break;
                            }
                        }
                        if (consumoPorTonelada <= 0){ // Si despues de los 3 intentos, el valor sigue siendo invalido, regresa al menu principal
                            System.out.println("\nLímite de intentos. Regresando al menú principal...");
                            break;
                        }
                    }

                    System.out.println("Ingresa el peso en toneladas:");
                    peso = sc.nextDouble();
                    sc.nextLine();

                    // Validar el peso del camion
                    if (peso <= 0){
                        for (int i = 1; i <= 3; i++){
                            System.out.println("Error: valor inválido. Intenta de nuevo.");
                            System.out.println("Ingresa el peso en toneladas:");
                            peso = sc.nextDouble();
                            sc.nextLine();

                            if (peso > 0){ // Si el usuario ingresa un valor valido, sale del bucle
                                break;
                            }
                        }
                        if (peso <= 0){ // Si despues de los 3 intentos, el valor sigue siendo invalido, regresa al menu principal
                            System.out.println("\nLímite de intentos. Regresando al menú principal...");
                            break;
                        }
                    }

                    // Instanciar objeto
                    vehiculo1 = new Camion("Camion", consumoPorTonelada, peso);

                    // Mostrar informacion
                    ((Camion)vehiculo1).mostrarNombre();
                    System.out.println("\nConsumo por tonelada: " + ((Camion)vehiculo1).getConsumoPorTonelada()); // Cast
                    System.out.println("Peso: " + ((Camion)vehiculo1).getPeso());
                    System.out.println("Consumo total: " + ((Camion)vehiculo1).calcularConsumo());
                    System.out.println("Velocidad máxima: " + ((Camion)vehiculo1).calcularVelocidadMaxima());

                    // Cambio en atributos
                    do {
                        System.out.println("\n¿Deseas realizar una acción con los atributos? (1: Get, 2: Set, 0: Volver al menú principal):");
                        accion = sc.nextInt();
                        sc.nextLine();

                        switch (accion){
                            case 1: // Get
                                ((Camion)vehiculo1).mostrarNombre();
                                System.out.println("\nConsumo por tonelada: " + ((Camion)vehiculo1).getConsumoPorTonelada());
                                System.out.println("Peso: " + ((Camion)vehiculo1).getPeso());
                                System.out.println("Consumo total: " + ((Camion)vehiculo1).calcularConsumo());
                                System.out.println("Velocidad máxima: " + ((Camion)vehiculo1).calcularVelocidadMaxima());

                                System.out.println("\nDeseas realizar otra acción? (1: Si, 0: No):");
                                accion = sc.nextInt(); // Se usa la misma variable accion para poder salir del bucle en caso de querer salir
                                sc.nextLine();
                                break;

                            case 2: // Set
                                // Ingresar nuevos valores
                                System.out.println("\nIngresa el nuevo nombre del camion:");
                                ((Camion)vehiculo1).setNombre(sc.nextLine());
                                System.out.println("Ingresa el nuevo consumo por toneladas del camion:");
                                ((Camion)vehiculo1).setConsumoPorTonelada(sc.nextDouble());
                                sc.nextLine();
                                System.out.println("Ingresa el nuevo peso:");
                                ((Camion)vehiculo1).setPeso(sc.nextDouble());
                                sc.nextLine();

                                // Mostrar informacion actualizada
                                ((Camion)vehiculo1).mostrarNombre();
                                System.out.println("\nNuevo consumo por tonelada: " + ((Camion)vehiculo1).getConsumoPorTonelada());
                                System.out.println("Nuevo peso: " + ((Camion)vehiculo1).getPeso());
                                System.out.println("Nuevo consumo total: " + ((Camion)vehiculo1).calcularConsumo());
                                System.out.println("Nueva velocidad máxima: " + ((Camion)vehiculo1).calcularVelocidadMaxima());

                                System.out.println("\nDeseas realizar otra acción? (1: Si, 0: No):");
                                accion = sc.nextInt(); // Se usa la misma variable accion para poder salir del bucle en caso de querer salir
                                sc.nextLine();
                                break;

                            case 0:
                                System.out.println("\nRegresando al menú principal...");
                                break;

                            default:
                                System.out.println("\nError: Opción inválida.");
                        }
                    }while (accion != 0);
                    break;

                case 3: // MOTOCICLETA
                    System.out.println("\n --- MOTOCICLETA ---");
                    // Ingresar los valores
                    System.out.println("Ingresa el consumo por litro de la motocicleta:");
                    consumoLitro = sc.nextDouble();
                    sc.nextLine();

                    // Validar consumo por litro
                    if (consumoLitro <= 0){
                        for (int i = 1; i <= 3; i++){
                            System.out.println("Error: valor inválido. Intenta de nuevo.");
                            System.out.println("Ingresa el consumo por litro de la motocicleta:");
                            consumoLitro = sc.nextDouble();
                            sc.nextLine();

                            if (consumoLitro > 0){ // Si el usuario ingresa un valor valido, sale del bucle
                                break;
                            }
                        }
                        if (consumoLitro <= 0){ // Si despues de los 3 intentos, el valor sigue siendo invalido, regresa al menu principal
                            System.out.println("\nLímite de intentos. Regresando al menú principal...");
                            break;
                        }
                    }

                    System.out.println("Ingresa la potencia del motor en caballos de fuerza:");
                    potenciaMotor = sc.nextDouble();
                    sc.nextLine();

                    // Validar potencia del motor
                    if (potenciaMotor <= 0){
                        for (int i = 1; i <= 3; i++){
                            System.out.println("Error: valor inválido. Intenta de nuevo.");
                            System.out.println("Ingresa la potencia del motor en caballos de fuerza:");
                            potenciaMotor = sc.nextDouble();
                            sc.nextLine();

                            if (potenciaMotor > 0){ // Si el usuario ingresa un valor valido, sale del bucle
                                break;
                            }
                        }
                        if (potenciaMotor <= 0){ // Si despues de los 3 intentos, el valor sigue siendo invalido, regresa al menu principal
                            System.out.println("\nLímite de intentos. Regresando al menú principal...");
                            break;
                        }
                    }

                    System.out.println("Ingresa la distancia recorrida:");
                    distancia = sc.nextDouble();
                    sc.nextLine();

                    // Validar distancia
                    if (distancia <= 0){
                        for (int i = 1; i <= 3; i++){
                            System.out.println("Error: valor inválido. Intenta de nuevo.");
                            System.out.println("Ingresa la distancia recorrida:");
                            distancia = sc.nextDouble();
                            sc.nextLine();

                            if (distancia > 0){ // Si el usuario ingresa un valor valido, sale del bucle
                                break;
                            }
                        }
                        if (distancia <= 0){ // Si despues de los 3 intentos, el valor sigue siendo invalido, regresa al menu principal
                            System.out.println("\nLímite de intentos. Regresando al menú principal...");
                            break;
                        }
                    }

                    // Instanciar objeto
                    vehiculo1 = new Motocicleta("Moto", consumoLitro, potenciaMotor, distancia);

                    // Mostrar informacion
                    ((Motocicleta)vehiculo1).mostrarNombre();
                    System.out.println("\nConsumo por litro: " + ((Motocicleta)vehiculo1).getConsumoLitro()); // Cast
                    System.out.println("Potencia del motor: " + ((Motocicleta)vehiculo1).getPotenciaMotor());
                    System.out.println("Distancia: " + ((Motocicleta)vehiculo1).getDistancia());
                    System.out.println("Consumo total: " + ((Motocicleta)vehiculo1).calcularConsumo());
                    System.out.println("Velocidad máxima: " + ((Motocicleta)vehiculo1).calcularVelocidadMaxima());

                    // Cambio en atributos
                    do {
                        System.out.println("\n¿Deseas realizar una acción con los atributos? (1: Get, 2: Set, 0: Volver al menú principal):");
                        accion = sc.nextInt();
                        sc.nextLine();

                        switch (accion){
                            case 1: // Get
                                ((Motocicleta)vehiculo1).mostrarNombre();
                                System.out.println("\nConsumo por litro: " + ((Motocicleta)vehiculo1).getConsumoLitro());
                                System.out.println("Potencia del motor: " + ((Motocicleta)vehiculo1).getPotenciaMotor());
                                System.out.println("Distancia: " + ((Motocicleta)vehiculo1).getDistancia());
                                System.out.println("Consumo total: " + ((Motocicleta)vehiculo1).calcularConsumo());
                                System.out.println("Velocidad máxima: " + ((Motocicleta)vehiculo1).calcularVelocidadMaxima());

                                System.out.println("\nDeseas realizar otra acción? (1: Si, 0: No):");
                                accion = sc.nextInt(); // Se usa la misma variable accion para poder salir del bucle en caso de querer salir
                                sc.nextLine();
                                break;

                            case 2: // Set
                                // Ingresar nuevos valores
                                System.out.println("\nIngresa el nuevo nombre de la motocicleta:");
                                ((Motocicleta)vehiculo1).setNombre(sc.nextLine());
                                System.out.println("Ingresa el nuevo consumo por litro de la motocicleta:");
                                ((Motocicleta)vehiculo1).setConsumoLitro(sc.nextDouble());
                                sc.nextLine();
                                System.out.println("Ingresa la nueva potencia del motor:");
                                ((Motocicleta)vehiculo1).setPotenciaMotor(sc.nextDouble());
                                sc.nextLine();
                                System.out.println("Ingresa la nueva distancia recorrida:");
                                ((Motocicleta)vehiculo1).setDistancia(sc.nextDouble());
                                sc.nextLine();

                                // Mostrar informacion actualizada
                                ((Motocicleta)vehiculo1).mostrarNombre();
                                System.out.println("\nNuevo consumo por litro: " + ((Motocicleta)vehiculo1).getConsumoLitro());
                                System.out.println("Nueva potencia del motor: " + ((Motocicleta)vehiculo1).getPotenciaMotor());
                                System.out.println("Nueva distancia: " + ((Motocicleta)vehiculo1).getDistancia());
                                System.out.println("Nuevo consumo total: " + ((Motocicleta)vehiculo1).calcularConsumo());
                                System.out.println("Nueva velocidad máxima: " + ((Motocicleta)vehiculo1).calcularVelocidadMaxima());

                                System.out.println("\nDeseas realizar otra acción? (1: Si, 0: No):");
                                accion = sc.nextInt(); // Se usa la misma variable accion para poder salir del bucle en caso de querer salir
                                sc.nextLine();
                                break;

                            case 0:
                                System.out.println("\nRegresando al menú principal...");
                                break;

                            default:
                                System.out.println("\nError: Opción inválida.");
                        }
                    }while (accion != 0);
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Error: opción inválida. Intenta de nuevo.");
                    break;
            }
        }while (opc != 0);

        sc.close();
    }
}