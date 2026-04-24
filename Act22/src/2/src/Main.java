public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Diego", 18, "Ingenieria de Software");
        Profesor profe1 = new Profesor("Daniel", 34, "Matematicas");
        Coordinador coordi1 = new Coordinador("Gael", 37, "FIE");
        Secretario secre1 = new Secretario("Ulises", 38, "5");
        Bibliotecario biblio1 = new Bibliotecario("Manuel", 25, "Vespertino");

        alumno1.saludar();
        alumno1.estudiar();
        profe1.saludar();
        profe1.darClase();
        coordi1.saludar();
        coordi1.coordinar();
        secre1.saludar();
        secre1.atender();
        biblio1.saludar();
        biblio1.prestarLibro();
    }
}