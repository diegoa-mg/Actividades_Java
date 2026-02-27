public class Libro {
    private String titulo, autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAnioPublicacion(){
        return anioPublicacion;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setAnioPublicacion(int anioPublicacion){
        if (anioPublicacion > 0 && anioPublicacion <= 2026) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Error: Año no válido.");
        }
    }

    public void verificarAnio(){
        if (anioPublicacion >= 2000){
            System.out.println("\nEl libro fue publicado en el año 2000 o después.");
        }
        else {
            System.out.println("\nEl libro fue publicado antes del año 2000.");
        }
    }
}