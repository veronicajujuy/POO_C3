import carrito.Carrito;
import carrito.Producto;

public class Main {
    public static void main(String[] args) {
        Carrito miCarrito = new Carrito();
        Producto producto1 = new Producto("Gaseosa", 2500);
        Producto producto2 = new Producto("Doritos", 1800);
        Producto producto3 = new Producto("Papitas", 2400);
        miCarrito.agregarProducto(producto1);
        miCarrito.pasarEstadoSiguiente();
        miCarrito.agregarProducto(producto1);
        miCarrito.agregarProducto(producto2);
        miCarrito.agregarProducto(producto3);
        miCarrito.mostrarProductos();
        miCarrito.pasarEstadoSiguiente();
        miCarrito.agregarProducto(producto3);
        miCarrito.cancelarCarrito();
    }
}
