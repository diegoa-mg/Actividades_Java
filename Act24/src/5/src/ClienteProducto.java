public class ClienteProducto extends Producto implements Cliente{
    ClienteProducto(String nombre){
        super(nombre);
    }

    public void recibirFactura(){
        if (nombre == null || nombre.trim().isEmpty()){
            System.out.println("Error: El nombre es invalido.");
            return;
        }
        System.out.println(nombre + " está recibiendo una factura.");
    }

    @Override
    public void comprarProducto() {
        if (nombre == null || nombre.trim().isEmpty()){
            System.out.println("Error: El nombre es invalido.");
            return;
        }
        System.out.println(nombre + " está comprando un producto.");
    }
}
