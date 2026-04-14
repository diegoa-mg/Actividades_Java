import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Variable para menú interactivo
        int opc;

        // Crear objetos vacíos
        EmpleadoInstrucciones emp1 = null;
        DepartamentoInstrucciones dep1 = null;

        do {
            System.out.println("\n --- Menú Interactivo ---");
            System.out.println("1. Ingresar datos de un empleado.");
            System.out.println("2. Ingresar datos de un departamento.git push origin main");
            System.out.println("3. Cambiar los atributos de un empleado.");
            System.out.println("4. Cambiar los atributos de un departamento.");
            System.out.println("0. Salir.");
            System.out.println("Selecciona una opción:");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc){
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                case 1:
                    System.out.println("\nIngresa el nombre del empleado:");
                    String nombreEmp = sc.nextLine();

                    System.out.println("Ingresa la edad del empleado:");
                    int edad = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingresa el salario del empleado:");
                    double salario = sc.nextDouble();
                    sc.nextLine();

                    emp1 = new EmpleadoInstrucciones(nombreEmp, edad, salario);
                    emp1.mostrarDetalles();

                    break;

                case 2:
                    System.out.println("\nIngresa el nombre del departamento:");
                    String nombreDep = sc.nextLine();

                    System.out.println("Ingresa la cantidad de empleados del departamento:");
                    int numEmpleados = sc.nextInt();
                    sc.nextLine();

                    dep1 = new DepartamentoInstrucciones(nombreDep, numEmpleados);

                    // Creación de empleados para el departamento
                    for (int i = 0; i < numEmpleados; i++){
                        System.out.println("\nIngresa el nombre del empleado " + (i + 1) + " de " + numEmpleados + ":");
                        String n = sc.nextLine(); // nombre

                        System.out.println("Ingresa la edad del empleado:");
                        int e = sc.nextInt(); // edad
                        sc.nextLine();

                        System.out.println("Ingresa el salario del empleado:");
                        double s = sc.nextDouble(); // salario
                        sc.nextLine();

                        dep1.getEmpleados()[i] = new EmpleadoInstrucciones(n, e , s); // Crear objetos EmpleadoInstrucciones
                    }

                    dep1.mostrarInformacion();

                    break;

                case 3:
                    if (emp1 == null){
                        System.out.println("Ingresa primero los datos.");
                        break;
                    }
                    System.out.println("\n --- Nueva Información Empleado ---");
                    System.out.println("Ingresa el nuevo nombre:");
                    String nuevoNombreEmp = sc.nextLine();

                    System.out.println("Ingresa la nueva edad:");
                    int nuevaEdad = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingresa el nuevo salario:");
                    double nuevoSalario = sc.nextDouble();
                    sc.nextLine();

                    emp1.cambiarAtributos(nuevoNombreEmp, nuevaEdad, nuevoSalario);
                    emp1.mostrarDetalles();
                    break;

                case 4:
                    if (dep1 == null){
                        System.out.println("Ingresa primero los datos.");
                        break;
                    }
                    System.out.println("\n --- Nueva Información Departamento ---");
                    System.out.println("Ingresa el nuevo nombre:");
                    String nuevoNombreDep = sc.nextLine();

                    System.out.println("Ingresa el nuevo número de empleados:");
                    int nuevoNumEmp = sc.nextInt();
                    sc.nextLine();

                    dep1.cambiarAtributos(nuevoNombreDep, nuevoNumEmp);
                    dep1.mostrarInformacion();
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opc != 0);
        sc.close();
    }
}