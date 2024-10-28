public class Celular extends Producto implements Vendible{

    private int capacidadBateria;
    private String resolucionCamara;

    public Celular(String nombre, String marca, long precio, int cantidadStock, int capacidadBateria, String resolucionCamara) {
        super(nombre, marca, precio, cantidadStock);
        this.capacidadBateria = capacidadBateria;
        this.resolucionCamara = resolucionCamara;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public String getResolucionCamara() {
        return resolucionCamara;
    }

    public void setResolucionCamara(String resolucionCamara) {
        this.resolucionCamara = resolucionCamara;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "capacidadBateria=" + capacidadBateria +
                ", resolucionCamara='" + resolucionCamara + '\'' +
                "} " + super.toString();
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("nombre: " + nombre + " marca: " + marca + " precio: " + precio + " cantidad: " + cantidadStock + " capacidad bateria: " + capacidadBateria + " resolucion camara: " + resolucionCamara);
    }

    public double calcularPrecioVenta(int cantidad) {
        double total = precio * cantidad;
        if (cantidad > 5) {
            total *= 0.9;
        }
        return total;
    }
}
