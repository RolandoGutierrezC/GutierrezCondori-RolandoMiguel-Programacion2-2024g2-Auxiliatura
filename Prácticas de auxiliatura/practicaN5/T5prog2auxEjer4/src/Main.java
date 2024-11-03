import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.agregarObjeto(new Objeto("Lanza", 3.5));
        inventario.agregarObjeto(new Objeto("Escudo", 5.0));
        inventario.agregarObjeto(new Objeto("Pocion", 0.2));
        inventario.agregarObjeto(new Objeto("Armadura de Placas", 10.0));
        inventario.agregarObjeto(new Objeto("Maza", 4.0));
        List<Objeto> objetosLivianos = inventario.filtrarObjetos(objeto -> objeto.getPeso() < 3.0);
        System.out.println("Objetos livianos: " + objetosLivianos);

        List<Objeto> objetosPesados = inventario.filtrarObjetos(objeto -> objeto.getPeso() >= 3.0);
        System.out.println("Objetos pesados: " + objetosPesados);

        List<Objeto> objetosConNombreLargo = inventario.filtrarObjetos(objeto -> objeto.getNombre().length() > 5);
        System.out.println("Objetos con nombre largo: " + objetosConNombreLargo);
    }
}
