public class Alumno extends Persona{
    String carrera;

    Alumno(String nombre, int edad, String carrera){
        super(nombre, edad);
        this.carrera = carrera;
    }

    void estudiar(){
        System.out.println("El alumno está estudiando");
    }
}
