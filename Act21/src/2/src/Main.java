public class Main {
    public static void main(String[] args) {
        Camion miCamion = new Camion("Kenworth", "T880", 20000);

        miCamion.mover();
        miCamion.encenderMotor();
        miCamion.cargar();
    }
}