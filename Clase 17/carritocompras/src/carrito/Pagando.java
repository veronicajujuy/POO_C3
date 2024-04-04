package carrito;

import java.util.List;

public class Pagando implements Estado{
    Carrito carrito;

    public Pagando(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void agregarProducto(List productos, Producto producto) {
        System.out.println("No se puede agregar mas productos");
    }

    @Override
    public void cancelarCarrito() {
        carrito.setEstado(new Vacio(carrito));
    }

    @Override
    public void volverPuntoAnterior() {
        carrito.setEstado(new Cargando(carrito));
    }

    @Override
    public void pasarEstadoSiguiente() {
        carrito.setEstado(new Cerrado(carrito));
    }
}
