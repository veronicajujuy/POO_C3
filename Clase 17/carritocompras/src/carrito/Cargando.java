package carrito;

import java.util.List;

public class Cargando implements Estado{
    Carrito carrito;

    public Cargando(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void agregarProducto(List productos, Producto producto) {
        System.out.println("Agregando producto... ");
        productos.add(producto);
    }

    @Override
    public void cancelarCarrito() {
        carrito.setEstado(new Vacio(carrito));
    }

    @Override
    public void volverPuntoAnterior() {
        carrito.setEstado(new Vacio(carrito));
    }

    @Override
    public void pasarEstadoSiguiente() {
        carrito.setEstado(new Pagando(carrito));
    }
}
