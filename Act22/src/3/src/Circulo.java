public class Circulo extends FiguraGeometrica {
    double radio;

    Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    double calcularArea() {
        return 3.1416 * (radio * radio);
    }
}
