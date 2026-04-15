public class Animal {
    String especie;

    public Animal(String especie){
        if (!especie.matches("[a-zA-ZáéíóúÁÉÍÓÚ ]+")){
            System.out.println("Error: La especie no debe contener caracteres especiales ni números.");
            return;
        }
        this.especie = especie;
    }

    public void hacerSonido(){
        System.out.println("Animal hace sonido");
    }
}
