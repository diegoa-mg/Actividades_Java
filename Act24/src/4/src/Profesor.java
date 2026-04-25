public class Profesor extends Persona implements Estudiante, Trabajador{
    Profesor(String nombre, int edad){
        super(nombre, edad);
    }

    void ensenar(){
        if (nombre == null){
            System.out.println("Error: Nombre vacío");
        }
        System.out.println(nombre + " está enseñando.");
    }

    @Override
    public void estudiar() {
        if (nombre == null){
            System.out.println("Error: Nombre vacío");
        }
        System.out.println(nombre + " está estudiando.");
    }

    @Override
    public void trabajar() {
        if (nombre == null){
            System.out.println("Error: Nombre vacío");
        }
        System.out.println(nombre + " está trabajando.");
    }
}
