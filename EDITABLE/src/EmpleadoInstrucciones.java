public class EmpleadoInstrucciones {
    private String nombre;
    private int edad;
    private double salario;

    public EmpleadoInstrucciones(String nombre, int edad, double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String clasificarSalario() {
        if (salario > 50000) {
            return "Alta";
        }
        else if (salario >= 10000) {
            return "Media";
        }
        else {
            return "Baja";
        }
    }

    public void mostrarDetalles() {
        System.out.println("\n --- Detalles del empleado ---");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Salario: " + getSalario());
        System.out.println("Clasificación: " + clasificarSalario());
    }

    public void cambiarAtributos(String nuevoNombre, int nuevaEdad, double nuevoSalario) {
        setNombre(nuevoNombre);
        setEdad(nuevaEdad);
        setSalario(nuevoSalario);
    }
}
