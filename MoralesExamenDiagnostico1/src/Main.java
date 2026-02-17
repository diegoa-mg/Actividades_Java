import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número para la tabla de multiplicar:");
        int num = sc.nextInt();
        int res = 1;

        if (num < 0){
            System.out.println("Error: valor invalido.");
            return;
        }

        System.out.println("Ingrese el inicio del rango:");
        int inicio = sc.nextInt();

        System.out.println("Ingrese el final del rango:");
        int fin = sc.nextInt();

        if (inicio < 0 || fin < 0){
            System.out.println("Error: Valores invalidos (menor a cero).");
            return;
        }

        if(inicio >= fin){
            System.out.println("Error: inicio no puede ser mayor o igual a fin.");
            return;
        }

        System.out.println("\n--- Tabla de Multiplicar del " + num + " ---");
        for (int i = inicio; i <= fin; i++){
            res = num * i;
            System.out.println(num + " x " + i + " = " + res);
        }

        sc.close();
    }
}