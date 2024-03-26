import patroncomposite.Carrito;
import patroncomposite.Combo;
import patroncomposite.ProductoIndividual;

public class Main {
    public static void main(String[] args) {
        ProductoIndividual hamburguesa = new ProductoIndividual("Hamburguesa doble", 10);
        ProductoIndividual papasFritas = new ProductoIndividual("Papas fritas", 3);
        ProductoIndividual gaseosa = new ProductoIndividual("Coca cola", 5);
        System.out.println("precio hamburguesa " + hamburguesa.calcularPrecio());

        Combo combo1 = new Combo("Hamburguesa Mcdoble",10);
        combo1.agregarProductos(hamburguesa);
        combo1.agregarProductos(papasFritas);
        combo1.agregarProductos(gaseosa);
        System.out.println("precio combo1 " + combo1.calcularPrecio());

        Combo comboGigante = new Combo("Combo gigante",0);
        comboGigante.agregarProductos(combo1);
        comboGigante.agregarProductos(gaseosa);
        comboGigante.agregarProductos(papasFritas);
        System.out.println("precio combo gigante " + comboGigante.calcularPrecio());

        Carrito carrito = new Carrito("carrito");
        carrito.agregarProductos(comboGigante);
        carrito.agregarProductos(combo1);
        carrito.agregarProductos(gaseosa);
        System.out.println("total carrito " + carrito.calcularPrecio());
    }
}
