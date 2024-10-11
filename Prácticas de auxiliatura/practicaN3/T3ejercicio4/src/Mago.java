class Mago extends Personaje {
    public int mana;

    public Mago(String nombre, int nivel, int puntosVida, int mana) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
    }

    public void lanzarHechizo() {
        System.out.println(nombre + " ha lanzado un hechizo.");
    }
}

