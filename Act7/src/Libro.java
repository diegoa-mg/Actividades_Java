public class Libro {
    String titulo, autor;
    int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public void resumen(){
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Año de publicación " + anioPublicacion);
    }
}