public class Poligono extends Figura{
    int numeroLados;

    public Poligono(String nombre, int numeroLados){
        super(nombre);
        this.numeroLados = numeroLados;
    }

    void mostrarLados(){
        System.out.println("Numero de Lados: " + numeroLados);
    }
}
