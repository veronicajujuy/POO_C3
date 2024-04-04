package carrito;

import java.util.List;

public interface Estado {
    void agregarProducto(List productos, Producto producto);
    void cancelarCarrito();
    void volverPuntoAnterior();
    void pasarEstadoSiguiente();
}
