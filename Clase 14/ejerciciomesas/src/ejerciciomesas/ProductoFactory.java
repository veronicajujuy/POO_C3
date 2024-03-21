package ejerciciomesas;

public class ProductoFactory {
    public static Producto crearProducto(String tipo) {
        switch (tipo) {
            case "CAJA10X10":
                return new Caja(10, 10, 10);
            case "PELOTAFUTBOL":
                return new Pelota(11);
            case "PELOTATENIS":
                return new Pelota(0.32);
            default:
                System.out.println("No existe ese tipo de pelota");
        }
        return null;
    }
}