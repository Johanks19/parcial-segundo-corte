import java.util.List;

public class Cliente {

    private String nombre;
    private String correo;
    private List<Producto> productosComprados;
    private double totalCompra;

    public Cliente(String nombre, String correo, List<Producto> productosComprados) {
        this.nombre = nombre;
        this.correo = correo;
        this.productosComprados = productosComprados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Producto> getProductosComprados() {
        return productosComprados;
    }

    public void setProductosComprados(List<Producto> productosComprados) {
        this.productosComprados = productosComprados;
    }

    public void comprarProducto(Producto producto, int cantidad){
        if (cantidad <= producto.getCantidadStock()){

            double precioPagar = ((Vendible)producto).calcularPrecioVenta(cantidad);
            totalCompra += precioPagar;

            System.out.println("compra realizada");

            productosComprados.add(producto);

        }else{
            System.out.println(" no hay la cantidad que necesitas");
        }

    }

    public void mostrarCompra(){

        System.out.println("Cliente: " + nombre + " Correo: " + correo);
        for (Producto producto : productosComprados) {
            producto.mostrarDetalles();
        }
        System.out.println("Total de la compra: " + totalCompra);


    }
}
