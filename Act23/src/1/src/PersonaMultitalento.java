public class PersonaMultitalento implements Estudiante, Deportista, Artista {
    String nombre, habilidad;
    int edad;

    PersonaMultitalento(String nombre, String habilidad, int edad){
        if (nombre == null || nombre.trim().isEmpty()){
            System.out.println("Error: El nombre no puede estar vacío.");
            return;
        }
        if (habilidad == null || habilidad.trim().isEmpty()) {
            System.out.println("Error: La habilidad no puede estar vacía.");
            return;
        }
        if (edad <= 0) {
            System.out.println("Error: La edad no puede ser nula o inválida.");
            return;
        }

        this.nombre = nombre;
        this.habilidad = habilidad;
        this.edad = edad;
    }

    @Override
    public void estudiar(){
        if (nombre == null) {
            System.out.println("Error: Datos inválidos.");
            return;
        }
        System.out.println(nombre + " está estudiando.");
    }

    @Override
    public void entrenar(){
        if (nombre == null) {
            System.out.println("Error: Datos inválidos.");
            return;
        }
        System.out.println(nombre + " está entrenando.");
    }

    @Override
    public void practicarArte(){
        if (nombre == null) {
            System.out.println("Error: Datos inválidos.");
            return;
        }
        System.out.println(nombre + " está practicando arte.");
    }
}
