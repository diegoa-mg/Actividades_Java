public class Triangulo extends Figura {
    Triangulo(String nombre, double base, double altura){
        super(nombre, base, altura);
    }

    @Override
    double calcularArea(){
        return (base * altura) / 2;
    }
}
