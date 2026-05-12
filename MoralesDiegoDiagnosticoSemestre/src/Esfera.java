public class Esfera extends Figura3D{
    private double radio;

    public Esfera(String nombre, double radio){
        super(nombre);
        setRadio(radio);
    }

    public void setRadio(double radio){
        if (radio <= 0){
            System.out.println("Error: valor inválido.");
            return;
        }
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    @Override
    public double calcularVolumen(){
        return (4.0 /3.0) * Math.PI * Math.pow(radio, 3);
    }
}
