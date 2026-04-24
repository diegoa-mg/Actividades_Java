public class Main {
    public static void main(String[] args) {
        Leon leon1 = new Leon("Leon", 5, true);
        Elefante elefante1 = new Elefante("Elefante", 7, 1200);
        Jirafa jirafa1 = new Jirafa("Jirafa", 9, 5);
        Cebra cebra1 = new Cebra("Cebra", 6, 120);
        Mono mono1 = new Mono("Mono", 3, "Mono2");

        leon1.hacerSonido();
        leon1.rugir();

        elefante1.hacerSonido();
        elefante1.usarTrompa();

        jirafa1.hacerSonido();
        jirafa1.comerHojas();

        cebra1.hacerSonido();
        cebra1.correr();

        mono1.hacerSonido();
        mono1.trepar();
    }
}