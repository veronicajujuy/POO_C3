package simulacionexamen;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private List<IOfertaAcademica> ofertasAcademicas;

    public Instituto() {
        ofertasAcademicas = new ArrayList<>();
    }
    public void agregarOfertas(IOfertaAcademica oferta){
        ofertasAcademicas.add(oferta);
    }

    public String mostrarOfertas(){
        String mostrar="";
        for(IOfertaAcademica oferta: ofertasAcademicas){
            mostrar += oferta.mostrarOferta()+ " precio: "+oferta.calcularPrecio() +"\n";
        }
        return mostrar;
    }

}
