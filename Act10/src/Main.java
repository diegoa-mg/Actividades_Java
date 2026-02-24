import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double km;

        Automovil Carro1 = new Automovil("Volskwagen", "GTI", 2012, 75506);

        System.out.println("Cuantos kilometros recorriste?:");
        km = sc.nextDouble();

        Carro1.conducir(km);
        Carro1.informacion();

        sc.close();
    }
}