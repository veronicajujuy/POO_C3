package contenedores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Puerto {
    private String nombre;
    private List<Contenedor> contenedores;

    public Puerto(String nombre) {
        this.nombre = nombre;
        contenedores = new ArrayList<Contenedor>();
    }
    public void agregarContenedor(Contenedor contenedor){
        contenedores.add(contenedor);
    }

    public void mostrarContenedores(){
        contenedores.sort(null);
        Iterator it = contenedores.iterator();
        while (it.hasNext()){
            Contenedor cont = (Contenedor)it.next();
            System.out.println("Contenedor "+ cont.getNum()+
                    " pais: "+cont.getPaisProcedencia()+" es peligroso: "+cont.isEsPeligrosa());
        }
    }
    public int contenedoresPeligrosos(){
        int peligroso = 0;
        for(Contenedor contenedor: contenedores){
            if(contenedor.isEsPeligrosa() && contenedor.getPaisProcedencia().equals(Procedencia.Desconocida)){
                peligroso++;
            }
        }
        return peligroso;
    }
}
