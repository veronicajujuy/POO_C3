package patroncomposite;

public class ProductoIndividual implements IProducto{
    private String name;
    private double precio;

    public ProductoIndividual(String name, double precio) {
        this.name = name;
        this.precio = precio;
    }

    public String getName() {
        return name;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }
}
