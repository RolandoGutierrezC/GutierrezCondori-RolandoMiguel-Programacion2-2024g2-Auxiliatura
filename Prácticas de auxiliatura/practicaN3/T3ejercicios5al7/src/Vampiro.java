class Vampiro extends Enemigo {
    public Vampiro(String nombre, int puntosVida, int dañoBase) {
        super(nombre, puntosVida, dañoBase);
    }

    @Override
    public int atacar() {
        int dañoInfligido = dañoBase;
        puntosVida += dañoInfligido / 2;
        return dañoInfligido;
    }
}
