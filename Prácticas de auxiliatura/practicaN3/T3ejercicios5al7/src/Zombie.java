class Zombie extends Enemigo {
    public Zombie(String nombre, int puntosVida, int dañoBase) {
        super(nombre, puntosVida, dañoBase);
    }

    @Override
    public int atacar() {
        puntosVida += 5;
        return dañoBase;
    }
}

