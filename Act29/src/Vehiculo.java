abstract class Vehiculo {
    private String nombre;

    public Vehiculo(String nombre){
        this.nombre = nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    abstract double calcularConsumo();

    abstract double calcularVelocidadMaxima();

    public void mostrarNombre(){
        System.out.println("Nombre: " + nombre);
    }
}
