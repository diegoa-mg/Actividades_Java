public class Figura {
    String nombre;
    double base, altura;

    Figura(String nombre, double base, double altura){
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }

    double calcularArea(){
        return base * altura;
    }
}
