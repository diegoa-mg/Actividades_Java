import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nom = sc.nextLine();

        System.out.print("Ingresa tu edad: ");
        int ed = sc.nextInt();

        System.out.print("Ingresa tu altura: ");
        double al = sc.nextDouble();

        System.out.print("Ingresa tu peso: ");
        double pe = sc.nextDouble();

        Persona Persona1 = new Persona(nom, ed, al, pe);

        Persona1.mostrarDatos();

        sc.close();
    }
}