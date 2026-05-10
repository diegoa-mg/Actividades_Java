import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int volumen;
        double costoMantenimientoBase;

        System.out.println("--- GUITARRA ---");
        System.out.println("Ingresa el volumen:");
        volumen = sc.nextInt();
        sc.nextLine();
        if(volumen < 1 || volumen > 10){
            System.out.println("Error: el volumen tiene que ser entre 1 y 10");
            return;
        }

        System.out.println("Ingresa el costo de mantenimiento base:");
        costoMantenimientoBase = sc.nextDouble();
        sc.nextLine();

        Instrumento g1 = new Guitarra("Guitarra", volumen, costoMantenimientoBase);

        g1.tocar();
        System.out.println("Volumen: " + g1.volumen);
        System.out.println("Costo mantenimiento: " + g1.calcularCostoMantenimiento());

        System.out.println("\n--- PIANO ---");
        System.out.println("Ingresa el volumen:");
        volumen = sc.nextInt();
        sc.nextLine();
        if(volumen < 1 || volumen > 10){
            System.out.println("Error: el volumen tiene que ser entre 1 y 10");
            return;
        }

        System.out.println("Ingresa el costo de mantenimiento base:");
        costoMantenimientoBase = sc.nextDouble();
        sc.nextLine();

        Instrumento p1 = new Piano("Piano", volumen, costoMantenimientoBase);

        p1.tocar();
        System.out.println("Volumen: " + p1.volumen);
        System.out.println("Costo mantenimiento: " + p1.calcularCostoMantenimiento());

        System.out.println("\n--- BATERIA ---");
        System.out.println("Ingresa el volumen:");
        volumen = sc.nextInt();
        sc.nextLine();
        if(volumen < 1 || volumen > 10){
            System.out.println("Error: el volumen tiene que ser entre 1 y 10");
            return;
        }

        System.out.println("Ingresa el costo de mantenimiento base:");
        costoMantenimientoBase = sc.nextDouble();
        sc.nextLine();

        Instrumento b1 = new Bateria("Bateria", volumen, costoMantenimientoBase);

        b1.tocar();
        System.out.println("Volumen: " + b1.volumen);
        System.out.println("Costo mantenimiento: " + b1.calcularCostoMantenimiento());

        sc.close();
    }
}