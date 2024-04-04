package carrito;

import java.util.List;

public class Vacio implements Estado{
    Carrito carrito;

    public Vacio(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void agregarProducto(List productos, Producto producto) {
        System.out.println("El carrito no puede cargar productos");

    }

    @Override
    public void cancelarCarrito() {
        System.out.println("No se puede vaciar un carrito vacio");
    }

    @Override
    public void volverPuntoAnterior() {
        System.out.println("No se puede volver al punto anterior");
    }

    @Override
    public void pasarEstadoSiguiente() {
        System.out.println("Pasando a Cargando");
        carrito.setEstado(new Cargando(carrito));
    }
}
