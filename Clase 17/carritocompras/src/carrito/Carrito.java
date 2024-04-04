package carrito;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    Estado estado;
    List<Producto> productos;

    public Carrito() {
        setEstado(new Vacio(this));
        productos = new ArrayList<>();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public void agregarProducto(Producto producto) {
        this.estado.agregarProducto(productos, producto);
    }


    public void cancelarCarrito() {
        this.estado.cancelarCarrito();
    }


    public void volverPuntoAnterior() {
        this.estado.volverPuntoAnterior();
    }


    public void pasarEstadoSiguiente() {
        this.estado.pasarEstadoSiguiente();
    }

    public void mostrarProductos(){
        for (Producto producto: productos) {
            System.out.println("Producto: "+ producto.getDescripcion() +" "+producto.getPrecio());
        }
    }
}
