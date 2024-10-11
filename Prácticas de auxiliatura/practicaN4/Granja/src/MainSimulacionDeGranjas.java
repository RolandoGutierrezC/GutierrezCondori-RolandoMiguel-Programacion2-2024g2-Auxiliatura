public class MainSimulacionDeGranjas {
    public static void main(String[] args) {
        Vaca vaca = new Vaca("Daisy", 3);
        vaca.mostrarInfo();
        vaca.hacerSonido();
        vaca.producir();
        vaca.alimentar();

        Oveja oveja = new Oveja("Luna", 2);
        oveja.mostrarInfo();
        oveja.hacerSonido();
        oveja.producir();
        oveja.alimentar();
    }
}
