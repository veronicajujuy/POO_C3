package clasepresencial;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Corolla","sedan",1.6,2022,50);
        Auto auto2 = new Auto("208","hatchback");

        System.out.println(auto1.arrancar());
        System.out.println(auto1.acelerar(2000));
        System.out.println("consumo de gasolina "+ auto1.consumoGasolina(500));

        System.out.println(auto2.arrancar());
        System.out.println(auto2.acelerar(2000));
        auto2.setCapacidadTanque(45);
        System.out.println("consumo de gasolina "+ auto2.consumoGasolina(500));
        auto1.setAnioFabricacion(2024);
        System.out.println("auto1.getAnioFabricacion() = " + auto1.getAnioFabricacion());

        System.out.println("cantidad de llantas "+ Auto.getCantidadLlantas());
        Auto.setCantidadLlantas(6);
        System.out.println("cantidad de llantas "+ Auto.getCantidadLlantas());
        Auto.setPrecioGasolina(1.2);
        System.out.println("Auto.getPrecioGasolina() = " + Auto.getPrecioGasolina());
        
    }
}
