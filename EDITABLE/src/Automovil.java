public class Automovil {
    String marca, modelo;
    int anio;
    double kilometraje;

    public Automovil(String marca, String modelo, int anio, double kilometraje){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
    }

    public double conducir(double km){
        return kilometraje += km;
    }

    public void informacion(){
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio + ", Kilometraje: " + kilometraje + " km.");
    }

}
