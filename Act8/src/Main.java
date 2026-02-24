import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cantidad = 0;
        char op;

        System.out.print("Ingresa el titular de la cuenta: ");
        String titu = sc.nextLine();

        System.out.print("Ingresa el numero de la cuenta: ");
        String num = sc.nextLine();

        System.out.print("Ingresa el saldo de la cuenta: ");
        double saldo = sc.nextDouble();
        sc.nextLine();

        CuentaBancaria MiCuenta = new CuentaBancaria(titu, num, saldo);

        System.out.print("Desea realizar un deposito? (s/n): ");
        op = sc.next().charAt(0);

        if (op == 's' || op == 'S'){
            System.out.print("Ingrese la cantidad: ");
            cantidad = sc.nextDouble();
            MiCuenta.depositar(cantidad);
        }

        System.out.print("Desea realizar un retiro? (s/n): ");
        op = sc.next().charAt(0);

        if (op == 's' || op == 'S'){
            System.out.print("Ingrese la cantidad: ");
            cantidad = sc.nextDouble();

            if (cantidad <= saldo){
                MiCuenta.retirar(cantidad);
            }
            else {
                System.out.println("Error: No puede retirar un valor mayor a " + saldo + " pesos.");
            }
        }

        MiCuenta.mostrarSaldo();

        sc.close();
    }
}