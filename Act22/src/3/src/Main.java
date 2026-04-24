public class Main {
    public static void main(String[] args) {
        Circulo cir1 = new Circulo("Rojo", 5.3);
        Rectangulo rec1 = new Rectangulo("Azul", 4.7, 9.2);
        Cuadrado cuad1 = new Cuadrado("Amarillo", 7.6);
        Triangulo tri1 = new Triangulo("Rojo", 4.7, 9.2);
        Trapecio tra1 = new Trapecio("Negro", 3,1.2,7.5);

        cir1.mostrarColor();
        System.out.println("Area: " + cir1.calcularArea());
        rec1.mostrarColor();
        System.out.println("Area: " + rec1.calcularArea());
        cuad1.mostrarColor();
        System.out.println("Area: " + cuad1.calcularArea());
        tri1.mostrarColor();
        System.out.println("Area: " + tri1.calcularArea());
        tra1.mostrarColor();
        System.out.println("Area: " + tra1.calcularArea());
    }
}