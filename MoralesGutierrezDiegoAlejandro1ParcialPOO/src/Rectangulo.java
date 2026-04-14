public class Rectangulo {
    private double base;
    private double altura;
    private String color;

    Rectangulo(double base, double altura, String color){
        this.base = base;
        this.altura = altura;
        this.color = color;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public String getColor() {
        return color;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calcularArea(){
        return base * altura;
    }

    public double calcularPerimetro(){
        return 2 * (base + altura);
    }

    public void mostrarInfo(){
        System.out.println("\n--- Resumen ---");
        System.out.println("Base: " + getBase());
        System.out.println("Altura: " + getAltura());
        System.out.println("Color: " + getColor());
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
}
