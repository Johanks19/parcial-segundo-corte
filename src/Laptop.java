public class Laptop extends Producto implements Vendible {
    private String procesador;
    private int memoriaRam;

    public Laptop(String nombre, String marca, long precio, int cantidadStock, String procesador, int memoriaRam) {
        super(nombre, marca, precio, cantidadStock);
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "procesador='" + procesador + '\'' +
                ", memoriaRam=" + memoriaRam +
                "} " + super.toString();
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("nombre: " + nombre + " marca: " + marca + " precio: " + precio + " cantidad: " + cantidadStock + " procesador: " + procesador + " memoria ram: " + memoriaRam);
    }

    public double calcularPrecioVenta(int cantidad) {
        double total = precio * cantidad;
        if (cantidad > 5) {
            total *= 0.9;
        }
        return total;
    }

}
