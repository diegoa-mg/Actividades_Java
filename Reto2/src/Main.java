public class Main {
    public static void main(String[] args) {
        EstudianteIngenieria alumno = new EstudianteIngenieria("Juan", "ATAFASDJF54543JGJ", 202020, "Ciberseguridad");
        Docente docente1 = new Docente("Lalo", "ALLADJFA39394");
        Secretaria secre = new Secretaria("Ernestina", "ADFADF959A3FJ", "Software");

        alumno.mostrarNombre();
        alumno.mostrarDatos();

        docente1.respirar();

        secre.mostrarNombre();
        secre.mostrarSecretaria();
    }
}