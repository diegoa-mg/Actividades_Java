public class Rectangulo {
    double altura, base;

    public Rectangulo(double altura, double base){
        this.altura = altura;
        this.base = base;
    }

    public double calcularArea(){
        return base * altura;
    }

    public double calcularPerimetro(){
        return 2 * (base + altura);
    }
}
