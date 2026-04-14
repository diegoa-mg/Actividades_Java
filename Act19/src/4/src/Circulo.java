public class Circulo extends Figura {
    double radio;

    public Circulo(String color, double radio){
        super(color);
        this.radio = radio;
    }

    public double calcularArea(){
        return 3.1416 * (radio * radio);
    }
}
