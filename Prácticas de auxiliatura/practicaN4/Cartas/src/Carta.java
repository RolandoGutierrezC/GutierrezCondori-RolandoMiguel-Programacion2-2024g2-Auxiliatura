abstract class Carta {
    public int valor;
    public String palo;
    public String descripcion;

    public Carta(int valor, String palo, String descripcion) {
        this.valor = valor;
        this.palo = palo;
        this.descripcion = descripcion;
    }

    public abstract void jugar();

    public void mostrarCarta() {
        System.out.println("Carta: " + valor + " de " + palo + " - " + descripcion);
    }
}



