class CartaEspecial extends Carta implements Accionable {
    public CartaEspecial(int valor, String palo, String descripcion) {
        super(valor, palo, descripcion);
    }

    @Override
    public void jugar() {
        System.out.println("Se ha jugado una carta especial: " + valor + " de " + palo);
    }

    @Override
    public void realizarAccion() {
        System.out.println("La carta especial realiza una acción especial!");
    }
}
