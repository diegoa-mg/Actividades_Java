public class Main {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Diego", 18, 500000, "Software");

        gerente1.mostrarDatos();
        gerente1.mostrarSueldo();
        gerente1.mostrarDepartamento();
    }
}