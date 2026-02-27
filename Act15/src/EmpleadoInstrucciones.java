import javax.swing.*;

public class EmpleadoInstrucciones {
    private String nombre;
    private int edad;
    private double salario;

    public EmpleadoInstrucciones(String nombre, int edad, double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    private String getNombre(){
        return nombre;
    }

    private int getEdad(){
        return edad;
    }

    private double getSalario(){
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

    public void clasificarSalario(){
        if(salario > 50000){
            System.out.println("Alta.");
        }
        else if (salario >= 10000) {
            System.out.println("Media.");
        }
        else{
            System.out.println("Baja.");
        }
    }

    public void mostrarDetalles(){
        System.out.println("\n --- Detalles del empleado ---");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Salario: " + getSalario());
    }

    public void cambiarAtributos(){

    }
}
