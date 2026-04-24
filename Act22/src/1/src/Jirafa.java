public class Jirafa extends Animal {
    double altura;

    Jirafa(String nombre, int edad, double altura){
        super(nombre, edad);
        this.altura = altura;
    }

    void comerHojas(){
        System.out.println("La jirafa come hojas altas");
    }
}
