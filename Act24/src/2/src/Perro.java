public class Perro extends Mamifero implements Domestico {
    Perro(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public void serDomestico() {
        System.out.println(nombre + " es doméstico.");
    }

    void ladrar(){
        System.out.println(nombre + " está ladrando.");
    }
}
