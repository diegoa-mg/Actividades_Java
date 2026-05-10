public class Bateria extends Instrumento{
    public Bateria(String nombre, int volumen, double costoMantenimientoBase){
        super(nombre, volumen, costoMantenimientoBase);
    }

    @Override
    public void tocar(){
        System.out.println("La batería marca el ritmo con fuerza.");
    }

    @Override
    public double calcularCostoMantenimiento(){
        return costoMantenimientoBase + (costoMantenimientoBase * .15);
    }
}
