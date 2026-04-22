public class Triangulo extends Poligono{
    double base, altura;

    public Triangulo(String nombre, int numeroLados, double base, double altura){
        super(nombre, numeroLados);
        this.base = base;
        this.altura = altura;
    }

    double calcularArea(){
        return (base * altura) / 2;
    }
}
