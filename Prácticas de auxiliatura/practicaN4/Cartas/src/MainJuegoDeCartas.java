public class MainJuegoDeCartas {
    public static void main(String[] args) {
        Carta cartaNormal = new CartaNormal(5, "Corazones", "Una carta básica.");
        cartaNormal.mostrarCarta();
        cartaNormal.jugar();

        CartaEspecial cartaEspecial = new CartaEspecial(10, "Diamantes", "Una carta con poderes mágicos.");
        cartaEspecial.mostrarCarta();
        cartaEspecial.jugar();
        cartaEspecial.realizarAccion();
    }
}
