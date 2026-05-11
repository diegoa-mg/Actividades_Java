public class Motocicleta extends Vehiculo{
    private double consumoLitro, potenciaMotor, distancia;

    public Motocicleta(String nombre, double consumoLitro, double potenciaMotor, double distancia){
        super(nombre);
        setConsumoLitro(consumoLitro);
        setPotenciaMotor(potenciaMotor);
        setDistancia(distancia);
    }

    public void setConsumoLitro(double consumoLitro) {
        if (consumoLitro <= 0) {
            System.out.println("Error: valor inválido. Debe ser mayor a 0.");
            return;
        }
        this.consumoLitro = consumoLitro;
    }

    public void setPotenciaMotor(double potenciaMotor) {
        if (potenciaMotor <= 0){
            System.out.println("Error: valor inválido. Debe ser mayor a 0.");
            return;
        }
        this.potenciaMotor = potenciaMotor;
    }

    public void setDistancia(double distancia) {
        if (distancia <= 0){
            System.out.println("Error: valor inválido. Debe ser mayor a 0.");
            return;
        }
        this.distancia = distancia;
    }

    public double getConsumoLitro() {
        return consumoLitro;
    }

    public double getPotenciaMotor() {
        return potenciaMotor;
    }

    public double getDistancia() {
        return distancia;
    }

    @Override
    public double calcularConsumo(){
        return consumoLitro * distancia;
    }

    @Override
    public double calcularVelocidadMaxima(){
        return potenciaMotor * 20;
    }
}
