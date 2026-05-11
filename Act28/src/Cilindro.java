public class Cilindro extends Figura3D{
    private double radio, altura;

    public Cilindro(String nombre, double radio, double altura){
        super(nombre);
        setRadio(radio);
        setAltura(altura);
    }

    public void setRadio(double radio){
        if (radio <= 0){
            System.out.println("Error: radio inválido.");
            return;
        }
        this.radio = radio;
    }

    public void setAltura(double altura) {
        if (altura <= 0){
            System.out.println("Error: altura inválida.");
            return;
        }
        this.altura = altura;
    }

    public double getRadio(){
        return radio;
    }

    public double getAltura(){
        return altura;
    }

    @Override
    double calcularVolumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }
}

