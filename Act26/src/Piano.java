public class Piano extends Instrumento {
    public Piano(String nombre, int volumen, double costoMantenimientoBase){
        super(nombre, volumen, costoMantenimientoBase);
    }

    @Override
    public void tocar(){
        System.out.println("El piano interpreta una melodíá clásica.");
    }

    @Override
    public double calcularCostoMantenimiento(){
        return costoMantenimientoBase + (costoMantenimientoBase * .20);
    }
}
