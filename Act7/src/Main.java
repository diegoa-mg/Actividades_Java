import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el titulo del libro: ");
        String titu = sc.nextLine();

        System.out.println("Ingresa el autor del libro: ");
        String autor = sc.nextLine();

        System.out.println("Ingresa el año de publicación del libro: ");
        int anio = sc.nextInt();

        Libro MiLibro = new Libro(titu, autor, anio);

        MiLibro.resumen();

        sc.close();
    }
}