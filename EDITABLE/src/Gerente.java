public class Gerente extends Empleado{
    String departamento;

    public Gerente(String nombre, int edad, double sueldo, String departamento){
        super(nombre, edad, sueldo);
        this.departamento = departamento;
    }

    public void mostrarDepartamento(){
        System.out.println("Departamento: " + departamento);
    }
}
