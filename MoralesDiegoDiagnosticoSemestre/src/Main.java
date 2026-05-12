import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declarar variables
        int menu, accion;
        double lado, altura, radio;

        // Instaciar Figura3D vacio
        Figura3D figura = null;

        do {
            // Menu principal
            System.out.println("\n --- MENÚ DE FIGURAS 3D ---");
            System.out.println("1. Cubo");
            System.out.println("2. Esfera");
            System.out.println("3. Cilindro");
            System.out.println("0. Salir");
            System.out.println("Selecciona una figura:");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu){
                case 1: // CUBO
                    System.out.println("\n --- CUBO ---");
                    System.out.println("Ingresa el lado del cubo:");
                    lado = sc.nextDouble();
                    sc.nextLine();

                    if (lado <= 0){ // Validar que el lado sea mayor a 0
                        for (int i = 1; i <= 3; i++){
                            System.out.println("Error: valor inválido. Intenta de nuevo.");
                            System.out.println("Ingresa el lado del cubo:");
                            lado = sc.nextDouble();
                            sc.nextLine();
                            if (lado > 0){ // Si lado es mayor a 0, sale del bucle, sino, vuelve a correr
                                break;
                            }
                        }
                        if (lado <= 0){ // En caso de que el usuario se quede sin intentos, regresar al menu principal
                            System.out.println("\nLímite de intentos. Regresando al menú principal...");
                            break;
                        }
                    }

                    figura = new Cubo("Cubo", lado); // Instanciar cubo
                    System.out.println("Figura: " + ((Cubo)figura).getNombre());
                    System.out.println("Volumen: " + ((Cubo)figura).calcularVolumen());

                    do {
                        System.out.println("\n¿Deseas realizar una acción con los atributos? (1: Get, 2: Set, 0: Volver al menú principal):");
                        accion = sc.nextInt();
                        sc.nextLine();

                        switch (accion){
                            case 1: // Get
                                System.out.println("\nFigura: " + ((Cubo)figura).getNombre());
                                System.out.println("Lado: " + ((Cubo) figura).getLado()); // Cast
                                System.out.println("Volumen: " + ((Cubo)figura).calcularVolumen());
                                System.out.println("\nDeseas realizar otra acción? (1: Si, 0: No):");
                                accion = sc.nextInt(); // Se usa la misma variable accion para poder salir del bucle en caso de querer salir
                                sc.nextLine();
                                break;

                            case 2: // Set
                                System.out.println("Ingresa el nuevo nombre de la figura:");
                                ((Cubo)figura).setNombre(sc.nextLine());
                                System.out.println("Ingresa el nuevo lado del cubo:");
                                ((Cubo)figura).setLado(sc.nextDouble());
                                sc.nextLine();

                                System.out.println("\nFigura: " + ((Cubo)figura).getNombre());
                                System.out.println("Nuevo lado: " + ((Cubo)figura).getLado());
                                System.out.println("Volumen actualizado: " + ((Cubo)figura).calcularVolumen());
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

                case 2: // ESFERA
                    System.out.println("\n --- ESFERA ---");
                    System.out.println("Ingresa el radio de la esfera:");
                    radio = sc.nextDouble();
                    sc.nextLine();

                    if (radio <= 0){ // Validar que el radio sea mayor a 0
                        for (int i = 1; i <= 3; i++){
                            System.out.println("Error: valor inválido. Intenta de nuevo.");
                            System.out.println("Ingresa el radio de la esfera:");
                            radio = sc.nextDouble();
                            sc.nextLine();
                            if (radio > 0){ // Si el radio es mayor a 0, sale del bucle, sino, vuelve a correr
                                break;
                            }
                        }
                        if (radio <= 0){ // En caso de que el usuario se quede sin intentos, regresar al menu principal
                            System.out.println("\nLímite de intentos. Regresando al menú principal...");
                            break;
                        }
                    }

                    figura = new Esfera("Esfera", radio); // Instanciar
                    System.out.println("Figura: " + ((Esfera)figura).getNombre());
                    System.out.println("Volumen: " + ((Esfera)figura).calcularVolumen());

                    do {
                        System.out.println("\n¿Deseas realizar una acción con los atributos? (1: Get, 2: Set, 0: Volver al menú principal):");
                        accion = sc.nextInt();
                        sc.nextLine();

                        switch (accion){
                            case 1: // Get
                                System.out.println("\nFigura: " + ((Esfera)figura).getNombre());
                                System.out.println("Radio: " + ((Esfera) figura).getRadio()); // Cast
                                System.out.println("Volumen: " + ((Esfera)figura).calcularVolumen());
                                System.out.println("\nDeseas realizar otra acción? (1: Si, 0: No):");
                                accion = sc.nextInt(); // Se usa la misma variable accion para poder salir del bucle en caso de querer salir
                                sc.nextLine();
                                break;

                            case 2: // Set
                                System.out.println("Ingresa el nuevo nombre de la figura:");
                                ((Esfera)figura).setNombre(sc.nextLine());
                                System.out.println("Ingresa el nuevo radio de la esfera:");
                                ((Esfera)figura).setRadio(sc.nextDouble());
                                sc.nextLine();

                                System.out.println("\nFigura: " + ((Esfera)figura).getNombre());
                                System.out.println("Nuevo radio: " + ((Esfera)figura).getRadio());
                                System.out.println("Volumen actualizado: " + ((Esfera)figura).calcularVolumen());
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

                case 3: // CILINDRO
                    System.out.println("\n --- CILINDRO ---");
                    System.out.println("Ingresa el radio del cilindro:");
                    radio = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Ingresa la altura del cilindro:");
                    altura = sc.nextDouble();
                    sc.nextLine();

                    if (radio <= 0 || altura <= 0){ // Validar que los valores sean mayores a 0
                        for (int i = 1; i <= 3; i++){
                            System.out.println("Error: valor inválido. Intenta de nuevo.");
                            System.out.println("Ingresa el radio del cilindro:");
                            radio = sc.nextDouble();
                            sc.nextLine();
                            System.out.println("Ingresa la altura del cilindro:");
                            altura = sc.nextDouble();
                            sc.nextLine();

                            if (radio > 0 && altura > 0){ // Si los valores son mayores a 0, sale del bucle, sino, vuelve a correr
                                break;
                            }
                        }
                        if (radio <= 0 || altura <= 0){ // En caso de que el usuario se quede sin intentos, regresar al menu principal
                            System.out.println("\nLímite de intentos. Regresando al menú principal...");
                            break;
                        }
                    }

                    figura = new Cilindro("Cilindro", radio,altura); // Instanciar cubo
                    System.out.println("Figura: " + ((Cilindro)figura).getNombre());
                    System.out.println("Volumen: " + ((Cilindro)figura).calcularVolumen());

                    do {
                        System.out.println("\n¿Deseas realizar una acción con los atributos? (1: Get, 2: Set, 0: Volver al menú principal):");
                        accion = sc.nextInt();
                        sc.nextLine();

                        switch (accion){
                            case 1: // Get
                                System.out.println("\nFigura: " + ((Cilindro)figura).getNombre());
                                System.out.println("Radio: " + ((Cilindro)figura).getRadio()); // Cast
                                System.out.println("Altura: " + ((Cilindro)figura).getAltura()); // Cast
                                System.out.println("Volumen: " + ((Cilindro)figura).calcularVolumen());
                                System.out.println("\nDeseas realizar otra acción? (1: Si, 0: No):");
                                accion = sc.nextInt(); // Se usa la misma variable accion para poder salir del bucle en caso de querer salir
                                sc.nextLine();
                                break;

                            case 2: // Set
                                System.out.println("Ingresa el nuevo nombre de la figura:");
                                ((Cilindro)figura).setNombre(sc.nextLine());
                                System.out.println("Ingresa el nuevo radio del cilindro:");
                                ((Cilindro)figura).setRadio(sc.nextDouble());
                                sc.nextLine();
                                System.out.println("Ingresa la nueva altura del cilindro:");
                                ((Cilindro)figura).setAltura(sc.nextDouble());
                                sc.nextLine();

                                System.out.println("\nFigura: " + ((Cilindro)figura).getNombre());
                                System.out.println("Nuevo radio: " + ((Cilindro)figura).getRadio());
                                System.out.println("Nueva altura: " + ((Cilindro)figura).getAltura());
                                System.out.println("Volumen actualizado: " + ((Cilindro)figura).calcularVolumen());
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
                    System.out.println("\nSaliendo del programa...");
                    break;

                default:
                    System.out.println("\nError: opción inválida. Intenta de nuevo.");
                    break;
            }

        }while (menu != 0);


        sc.close();
    }
}