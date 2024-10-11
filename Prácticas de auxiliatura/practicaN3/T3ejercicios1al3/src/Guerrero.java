class Guerrero extends Personaje {
    public int fuerza;

    public Guerrero(String nombre, int nivel, int puntosVida, int fuerza) {
        super(nombre, nivel, puntosVida);
        this.fuerza = fuerza;
    }

    public void atacar() {
        System.out.println(nombre + " ha realizado un ataque.");
    }
}

