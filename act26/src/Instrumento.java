public class Instrumento {
    String nombre;
    int volumen;
    double costoMantenimientoBase;

    public Instrumento(String nombre, int volumen, double costoMantenimientoBase){
        if(volumen < 1 || volumen > 10){
            System.out.println("Error: el volumen tiene que ser entre 1 y 10");
            return;
        }
        this.nombre = nombre;
        this.volumen = volumen;
        this.costoMantenimientoBase = costoMantenimientoBase;
    }

    public void tocar(){
        System.out.println("Tocando un instrumento genérico.");
    }

    public double calcularCostoMantenimiento(){
        return costoMantenimientoBase;
    }
}
