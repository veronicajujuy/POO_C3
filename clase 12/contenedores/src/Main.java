import contenedores.Contenedor;
import contenedores.Procedencia;
import contenedores.Puerto;

public class Main {
    public static void main(String[] args) {
        Contenedor contenedor1 = new Contenedor(22, Procedencia.Brasil, false);
        Contenedor contenedor2 = new Contenedor(11, Procedencia.Desconocida, true);
        Contenedor contenedor3 = new Contenedor(5, Procedencia.Desconocida, true);
        Contenedor contenedor4 = new Contenedor(33, Procedencia.China, false);
        Puerto puerto = new Puerto("Bs As");
        puerto.agregarContenedor(contenedor1);
        puerto.agregarContenedor(contenedor2);
        puerto.agregarContenedor(contenedor3);
        puerto.agregarContenedor(contenedor4);
        puerto.mostrarContenedores();
        System.out.println("cantidad contenedores peligrosos "+ puerto.contenedoresPeligrosos());
    }
}
