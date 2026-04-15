public class Auto extends Vehiculo {
    String placa;

    public Auto(String modelo, String placa){
        super(modelo);
        if (!placa.matches("[a-zA-Z0-9]{7}") || !placa.matches(".*[a-zA-Z].*") || !placa.matches(".*[0-9].*")){
            System.out.println("Error: La placa debe tener 7 caracteres y contener al menos 1 letra y 1 número.");
            return;
        }
        this.placa = placa;
    }

    public void tocarBocina(){
        System.out.println("¡Beep beep!");
    }
}
