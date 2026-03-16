import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Variable para el menu interactivo
        int opc;

        // Crear objetos
        EmpleadoInstrucciones emp1 = null;
        DepartamentoInstrucciones dep1 = null;

        do {
            System.out.println("\n --- Menú Interactivo ---");
            System.out.println("1. Ingresar datos de un empleado.");
            System.out.println("2. Ingresar datos de un departamento.");
            System.out.println("3. Cambiar los atributos de un empleado.");
            System.out.println("4. Cambiar los atributos de un departamento.");
            System.out.println("0. Salir.");
            System.out.println("Selecciona una opción:");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
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

                    System.out.println("Ingresa el número de empleados del departamento:");
                    int numEmpleados = sc.nextInt();
                    sc.nextLine();

                    dep1 = new DepartamentoInstrucciones(nombreDep, numEmpleados);

                    for (int i = 0; i < numEmpleados; i++){
                        System.out.println("\nIngresa el nombre del empleado:");
                        String n = sc.nextLine();

                        System.out.println("Ingresa la edad del empleado:");
                        int e = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Ingresa el salario del empleado:");
                        double s = sc.nextDouble();
                        sc.nextLine();

                        dep1.getEmpleados()[i] = new EmpleadoInstrucciones(n, e, s);
                    }

                    dep1.mostrarInformacion();

                    break;

                case 3:
                    if (emp1 == null) {
                        System.out.println("Ingresa primero los datos.");
                        break;
                    }
                    System.out.println("\n --- Nueva Información Empleado");
                    System.out.println("Ingresa el nombre del empleado:");
                    String nuevoNombreEmp = sc.nextLine();

                    System.out.println("Ingresa la edad del empleado:");
                    int nuevaEdad = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingresa el salario del empleado:");
                    double nuevoSalario = sc.nextDouble();
                    sc.nextLine();

                    emp1.cambiarAtributos(nuevoNombreEmp, nuevaEdad, nuevoSalario);
                    emp1.mostrarDetalles();

                    break;

                case 4:
                    if (dep1 == null) {
                        System.out.println("Ingresa primero los datos.");
                        break;
                    }
                    System.out.println("\n --- Nueva Información Departamento");
                    System.out.println("Ingresa el nombre del Departamento:");
                    String nuevoNombreDep = sc.nextLine();

                    System.out.println("Ingresa el nuevo número de empleados:");
                    int nuevoNumEmp = sc.nextInt();
                    sc.nextLine();

                    dep1.cambiarAtributos(nuevoNombreDep, nuevoNumEmp);
                    dep1.mostrarInformacion();

                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opc != 0);

        sc.close();
    }
}