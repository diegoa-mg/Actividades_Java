import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Persona Persona1 = new Persona("Diego", 18, 1.75);
        Persona Persona2 = new Persona("Migue", 18, 1.69);

        Persona1.caminar();
        Persona2.caminar();
        Persona1.hablar();
        Persona2.hablar();
    }
}