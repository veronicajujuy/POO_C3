import ejerciciomesas.Almacen;
import ejerciciomesas.Producto;
import ejerciciomesas.ProductoFactory;

public class Main {
    public static void main(String[] args) {
        try {
            Producto producto1 = ProductoFactory.crearProducto("CAJA10X10");
            Producto producto2 = ProductoFactory.crearProducto("CAJA10X10");
            Producto producto3 = ProductoFactory.crearProducto("PELOTATENIS");
            Producto producto4 = ProductoFactory.crearProducto("PELOTAFUTBOL");

            System.out.println(producto1.calcularEspacio());

            Almacen almacen = new Almacen();
            almacen.agregarProductos(producto1);
            almacen.agregarProductos(producto2);
            almacen.agregarProductos(producto3);
            almacen.agregarProductos(producto4);
            System.out.println("Total espacio necesario: " + almacen.calcularEspacioNecesario());
        }catch (Exception e){
            System.err.println("Excepcion: "+ e.getMessage());
        }
    }
}
