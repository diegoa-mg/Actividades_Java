public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo("Rojo", 15);

        circulo1.mostrarColor();
        System.out.println("Area: " + circulo1.calcularArea());
    }
}