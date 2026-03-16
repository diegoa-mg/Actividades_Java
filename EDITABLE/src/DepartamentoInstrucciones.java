public class DepartamentoInstrucciones {
    private String nombre;
    private int numeroEmpleados;
    private EmpleadoInstrucciones[] empleados;

    public DepartamentoInstrucciones(String nombre, int numeroEmpleados) {
        this.nombre = nombre;
        this.numeroEmpleados = numeroEmpleados;
        this.empleados = new EmpleadoInstrucciones[numeroEmpleados];
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public EmpleadoInstrucciones[] getEmpleados() {
        return empleados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public void setEmpleados(EmpleadoInstrucciones[] empleados) {
        this.empleados = empleados;
    }

    public String clasificarNumeroEmpleados() {
        int longitud = String.valueOf(numeroEmpleados).length();
        if (longitud == 1){
            return "1 dígito";
        }
        else if (longitud == 2){
            return "2 dígitos";
        }
        else if (longitud == 3){
            return "3 dígitos";
        }
        else {
            return "Más de 3 dígitos";
        }
    }

    public void mostrarInformacion() {
        System.out.println("\n --- Información del departamento ---");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Número de empleados: " + getNumeroEmpleados());
        System.out.println("Clasificación: " + clasificarNumeroEmpleados());
        for (int i = 0; i < empleados.length; i++){
            if (empleados[i] != null){
                empleados[i].mostrarDetalles();
            }
        }
    }

    public void cambiarAtributos(String nuevoNombre, int nuevoNumeroEmpleados) {
        setNombre(nuevoNombre);
        setNumeroEmpleados(nuevoNumeroEmpleados);
        this.empleados = new EmpleadoInstrucciones[nuevoNumeroEmpleados];
    }
}
