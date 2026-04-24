public class Cuadrado extends FiguraGeometrica{
    double lado;

    Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    double calcularArea(){
        return lado * lado * lado * lado;
    }
}
