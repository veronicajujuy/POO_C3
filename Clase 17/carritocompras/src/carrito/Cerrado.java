package carrito;

import java.util.List;

public class Cerrado implements Estado{
    Carrito carrito;

    public Cerrado(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void agregarProducto(List productos, Producto producto) {
        System.out.println("No se puede agregar productos en un estado cerrado");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("No se puede cancelar  en un estado cerrado");
    }

    @Override
    public void volverPuntoAnterior() {
        System.out.println("No se puede volver atras en un estado cerrado");
    }

    @Override
    public void pasarEstadoSiguiente() {
        System.out.println("No se puede volver en un estado cerrado");
    }
}
