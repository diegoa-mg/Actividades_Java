public class Triangulo extends FiguraGeometrica{
    double base, altura;

    Triangulo(String color, double base, double altura){
        super(color);
        this.base = base;
        this.altura = altura;
    }

    double calcularArea(){
        return (base * altura) / 2;
    }
}
