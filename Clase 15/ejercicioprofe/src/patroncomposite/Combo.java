package patroncomposite;

import java.util.ArrayList;
import java.util.List;

public class Combo implements IProducto{
    private String nombre;
    private double descuento;
    private List<IProducto> productos;

    public Combo(String nombre, double descuento) {
        this.nombre = nombre;
        this.descuento = descuento;
        productos = new ArrayList<>();
    }

    public void agregarProductos(IProducto producto){
        productos.add(producto);
    }
    public void removerProductos(IProducto producto){
        productos.remove(producto);
    }

    @Override
    public double calcularPrecio() {
        double totalPrecio = 0;
        for (IProducto producto: productos ) {
            totalPrecio += producto.calcularPrecio();
        }
        //descuento: 10
        totalPrecio -= (totalPrecio*descuento/100);
        return totalPrecio;
    }
}
