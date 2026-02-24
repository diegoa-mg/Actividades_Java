public class Alumno {
    String nombre, numCuenta;

    public Alumno(String nombre, String numCuenta){
        this.nombre = nombre;
        this.numCuenta = numCuenta;
    }

    public void programar(){
        System.out.println(nombre + " está programando.");
    }

    public void decirNombre(){
        System.out.println("Soy " + nombre);
    }
}
