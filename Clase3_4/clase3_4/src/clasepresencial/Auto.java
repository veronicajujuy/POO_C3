package clasepresencial;
/*
* - modelo: String
- tipo: String
- cilindrada: double
- anioFabricacion: int
- capacidadTanque: int
+ arrancar(): String
+ acelerar(int rmp): String
+ consumoDeGasolina(double km): double*/
public class Auto {
    private String modelo;
    private String tipo;
    private double cilindrada;
    private int anioFabricacion;
    private int capacidadTanque;

    private static int cantidadLlantas;
    private static double precioGasolina;

    public static int getCantidadLlantas() {
        return cantidadLlantas;
    }

    public static void setCantidadLlantas(int cantidadLlantas) {
        Auto.cantidadLlantas = cantidadLlantas;
    }

    public static double getPrecioGasolina() {
        return precioGasolina;
    }

    public static void setPrecioGasolina(double precioGasolina) {
        Auto.precioGasolina = precioGasolina;
    }

    public Auto(String modelo, String tipo, double cilindrada, int anio, int capacidad){
        this.modelo = modelo;
        this.tipo = tipo;
        this.cilindrada = cilindrada;
        anioFabricacion = anio;
        capacidadTanque = capacidad;
        cantidadLlantas = 5;
    }

    public Auto(String modelo, String tipo) {
        this.modelo = modelo;
        this.tipo = tipo;
        cantidadLlantas = 5;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public String arrancar(){
        return "El auto "+ modelo + " "+tipo +" esta arrancando";
    }
    public String acelerar(int rpm){
        return "El auto "+ modelo + " "+tipo +"esta acelerando a "+ rpm +"rpm";
    }
    public double consumoGasolina( double km){
        return (capacidadTanque/km)*100;
    }

}
