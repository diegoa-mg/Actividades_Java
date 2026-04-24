public class Rectangulo extends FiguraGeometrica{
    double base, altura;

    Rectangulo(String color, double base, double altura) {
        super(color);
        this.altura = altura;
        this.base = base;
    }

    double calcularArea() {
        return base * altura;
    }
}
