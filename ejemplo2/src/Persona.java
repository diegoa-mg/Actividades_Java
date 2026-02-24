public class Persona {
    String nombre;
    int edad;
    double altura;

    public Persona(String nombre, int edad, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public void hablar(){
        System.out.println(nombre + " está hablando.");
    }

    public void caminar(){
        System.out.println(nombre + " está caminando.");
    }
}
