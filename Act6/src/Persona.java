public class Persona {
    String nombre;
    int edad;
    double altura, peso;

    public Persona(String nombre, int edad, double altura, double peso){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edadc: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
    }
}