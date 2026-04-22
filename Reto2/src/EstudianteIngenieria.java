public class EstudianteIngenieria extends Estudiante{
    String especialidad;

    public EstudianteIngenieria(String nombre, String curp, int matricula, String especialidad){
        super(nombre, curp, matricula);
        this.especialidad = especialidad;
    }



}
