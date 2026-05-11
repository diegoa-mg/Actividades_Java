public class Camion extends Vehiculo{
    private double consumoPorTonelada, peso;

    public Camion(String nombre, double consumoPorTonelada, double peso){
        super(nombre);
        setConsumoPorTonelada(consumoPorTonelada);
        setPeso(peso);
    }

    public void setConsumoPorTonelada(double consumoPorTonelada) {
        if (consumoPorTonelada <= 0){
            System.out.println("Error: valor inválido. Debe ser mayor a 0.");
            return;
        }
        this.consumoPorTonelada = consumoPorTonelada;
    }

    public void setPeso(double peso){
        if (peso <= 0){
            System.out.println("Error: valor inválido. Debe ser mayor a 0.");
            return;
        }
        this.peso = peso;
    }

    public double getConsumoPorTonelada() {
        return consumoPorTonelada;
    }

    public double getPeso(){
        return peso;
    }

    @Override
    public double calcularConsumo(){
        return consumoPorTonelada * peso;
    }

    @Override
    public double calcularVelocidadMaxima(){
        return peso * 5;
    }
}
