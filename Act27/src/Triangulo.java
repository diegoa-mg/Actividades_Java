public class Triangulo extends Figura {
    double base, altura;

    public Triangulo(String nombre, double base, double altura){
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return (base * altura) / 2;
    }
}
