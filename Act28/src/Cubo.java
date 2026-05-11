public class Cubo extends Figura3D  {
    private double lado;

    public Cubo(String nombre, double lado){
        super(nombre);
        setLado(lado);
    }

    public void setLado(double lado){
        if (lado <= 0){
            System.out.println("Error: valor inválido.");
            return;
        }
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

    @Override
    public double calcularVolumen(){
        return Math.pow(lado, 3);
    }
}
