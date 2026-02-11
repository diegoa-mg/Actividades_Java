import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Ingresa el radio del cilindro: ");
            int radio = sc.nextInt();

            System.out.print("Ingresa la altura del cilindro: ");
            int altura = sc.nextInt();

            double pi = 3.1416;
            double area = 2 * pi * radio * (radio + altura);


        }
    }