public class Cuadrado extends Figura{
    double lado;

    public Cuadrado(String nombre, double lado){
        super(nombre);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
