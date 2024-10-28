//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Laptop laptopAsus = new Laptop("vivoBook", "ASUS", 2000000, 20, "Ryzen 5", 16);
        Celular celularSamsung = new Celular("Galaxy S21", "Samsung", 1800000, 10, 4000, "15 mega pixeles");

        Cliente cliente1 = new Cliente("Johan Blanco", "JohanBlanco@gmail.com");
        Cliente cliente2 = new Cliente("Cecilia Sanchez", "CeciliaSanchez@gmail.com");

        cliente1.comprarProducto(laptopAsus, 4);
        cliente1.comprarProducto(celularSamsung, 6);

        cliente2.comprarProducto(laptopAsus, 3); //
        cliente2.comprarProducto(celularSamsung, 2);

        System.out.println("\n--- compras ---");
        cliente1.mostrarCompra();
        cliente2.mostrarCompra();




    }
}