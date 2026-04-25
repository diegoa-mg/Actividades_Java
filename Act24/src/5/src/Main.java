public class Main {
    public static void main(String[] args) {
        ClienteProducto clpr1 = new ClienteProducto("Cliente");

        clpr1.mostrarDetalles();
        clpr1.comprarProducto();
        clpr1.recibirFactura();
    }
}