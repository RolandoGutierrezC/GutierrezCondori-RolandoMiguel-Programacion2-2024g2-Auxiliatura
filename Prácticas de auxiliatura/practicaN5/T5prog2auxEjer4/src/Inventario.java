import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Objeto> objetos;

    public Inventario() {
        objetos = new ArrayList<>();
    }

    public void agregarObjeto(Objeto objeto) {
        objetos.add(objeto);
    }

    public List<Objeto> filtrarObjetos(FiltroObjeto filtro) {
        List<Objeto> objetosFiltrados = new ArrayList<>();
        for (Objeto objeto : objetos) {
            if (filtro.filtrar(objeto)) {
                objetosFiltrados.add(objeto);
            }
        }
        return objetosFiltrados;
    }
}
