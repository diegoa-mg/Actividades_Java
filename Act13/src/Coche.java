public class Coche {
    private String marca, modelo;
    private double velocidadMaxima, gastoGasolinaPorLitro;

    public Coche(String marca, String modelo, double velocidadMaxima, double gastoGasolinaPorLitro){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.gastoGasolinaPorLitro = gastoGasolinaPorLitro;
    }

    // get
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public double getGastoGasolinaPorLitro() {
        return gastoGasolinaPorLitro;
    }

    // set
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void setGastoGasolinaPorLitro(double gastoGasolinaPorLitro) {
        this.gastoGasolinaPorLitro = gastoGasolinaPorLitro;
    }

    public double calcularGastoDeGasolina(double distancia){
        return (distancia / gastoGasolinaPorLitro);
    }
}