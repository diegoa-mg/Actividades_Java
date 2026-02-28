public class DepartamentoInstrucciones {
    private String nombre;
    private int numeroEmpleados;
    private Empleado[] empleados;

    public DepartamentoInstrucciones(String nombre, int numeroEmpleados){
        this.nombre = nombre;
        this.numeroEmpleados = numeroEmpleados;
        this.empleados = new Empleado[numeroEmpleados];
    }

    public String getNombre(){
        return nombre;
    }

    public int getNumeroEmpleados(){
        return numeroEmpleados;
    }

    public Empleado[] getEmpleados(){
        return empleados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public void setEmpleados(Empleado[] empleados){
        this.empleados = empleados;
    }

    public void clasificarNumeroEmpleados(){
        if(numeroEmpleados.length == 1){

        }
    }
}
