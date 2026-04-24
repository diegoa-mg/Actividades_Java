public class Trapecio extends FiguraGeometrica{
    double baseMayor, baseMenor, altura;

    Trapecio(String color, double baseMayor, double baseMenor, double altura){
        super(color);
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    double calcularArea(){
        return ((baseMayor + baseMenor) * altura) / 2;
    }
}
