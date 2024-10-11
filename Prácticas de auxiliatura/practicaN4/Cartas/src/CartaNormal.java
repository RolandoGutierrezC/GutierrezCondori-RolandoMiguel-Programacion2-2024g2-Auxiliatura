class CartaNormal extends Carta {
    public CartaNormal(int valor, String palo, String descripcion) {
        super(valor, palo, descripcion);
    }

    @Override
    public void jugar() {
        System.out.println("Se ha jugado una carta normal: " + valor + " de " + palo);
    }
}
