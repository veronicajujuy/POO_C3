package patroncomposite;

import java.util.ArrayList;
import java.util.List;

public class Carrito implements IProducto {
    private String nombre;
    private List<IProducto> productos;

    public Carrito(String nombre) {
        this.nombre = nombre;
        productos = new ArrayList<>();
    }

    public void agregarProductos(IProducto producto) {
        productos.add(producto);
    }

    public void removerProductos(IProducto producto) {
        productos.remove(producto);
    }

    @Override
    public double calcularPrecio() {
        double totalPrecio = 0;
        for (IProducto producto : productos) {
            totalPrecio += producto.calcularPrecio();
        }
        return totalPrecio;
    }
}
