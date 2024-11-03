public class Main {
    public static void main(String[] args) {
        Aventura aventura = new Aventura();
        aventura.agregarTarea(() -> System.out.println("Recolectar menas de obsidiana"));
        aventura.agregarTarea(() -> System.out.println("Derrota a Dracula"));
        aventura.agregarTarea(() -> System.out.println("Repara las defensas"));
        aventura.agregarTarea(() -> System.out.println("Escolta al granjero"));
        aventura.agregarTarea(() -> System.out.println("Derriba tropas aereas enemigas"));
        aventura.iniciar();
    }
}
