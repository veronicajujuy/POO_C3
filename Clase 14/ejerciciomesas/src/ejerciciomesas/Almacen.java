package ejerciciomesas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Almacen {
    List<Producto> productos;

    public Almacen() {
        productos = new ArrayList<>();
    }
    public void agregarProductos(Producto producto){
        productos.add(producto);
    }
    public double calcularEspacioNecesario(){
        double espacio = 0;

        for (Producto producto: productos) {
            espacio += producto.calcularEspacio();
        }
        return espacio;
    }

}
