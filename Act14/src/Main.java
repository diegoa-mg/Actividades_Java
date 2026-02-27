import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opc, opcAtri;

        System.out.println("Ingresa el título del libro: ");
        String titulo = sc.nextLine();

        System.out.println("Ingresa el autor del libro: ");
        String autor = sc.nextLine();

        System.out.println("Ingresa el año de publicación del libro: ");
        int anioPubli = sc.nextInt();
        sc.nextLine();

        Libro L1 = new Libro(titulo, autor, anioPubli);

        System.out.println("\n --- Información del libro ---");
        System.out.println("Título: " + L1.getTitulo());
        System.out.println("Autor: " + L1.getAutor());
        System.out.println("Año de publicación: " + L1.getAnioPublicacion());

        System.out.println("\n¿Quieres cambiar algún atributo? (s/n):");
        opc = sc.next().charAt(0);

        if(opc == 's' || opc == 'S'){
            System.out.println("¿Qué atributo te gustaría cambiar?");
            System.out.println("1. Título.");
            System.out.println("2. Autor.");
            System.out.println("3. Año de publicación.");
            opcAtri = sc.nextInt();
            sc.nextLine();

            switch (opcAtri){
                case 1:
                    System.out.println("Ingresa el nuevo título:");
                    titulo = sc.nextLine();
                    L1.setTitulo(titulo);
                    break;

                case 2:
                    System.out.println("Ingresa el nuevo autor:");
                    autor = sc.nextLine();
                    L1.setAutor(autor);
                    break;

                case 3:
                    System.out.println("Ingresa el nuevo año de publicación:");
                    anioPubli = sc.nextInt();
                    sc.nextLine();
                    L1.setAnioPublicacion(anioPubli);
                    break;

                default:
                    System.out.println("Error. Opción inválida.");
                    break;
            }
        }

        System.out.println("\n --- Información del libro actualizada ---");
        System.out.println("Título: " + L1.getTitulo());
        System.out.println("Autor: " + L1.getAutor());
        System.out.println("Año de publicación: " + L1.getAnioPublicacion());

        L1.verificarAnio();

        sc.close();
    }
}