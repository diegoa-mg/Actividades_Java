public class Gato extends Animal {
    String color;

    public Gato(String especie, String color){
        super(especie);
        if (!color.matches("[a-zA-ZáéíóúÁÉÍÓÚ ]+") || color.length() <= 3){
            System.out.println("El color debe tener más de 3 letras y no contener dígitos.");
            return;
        }
        this.color = color;
    }

    public void ronronear(){
        System.out.println("El gato ronronea felizmente.");
    }
}
