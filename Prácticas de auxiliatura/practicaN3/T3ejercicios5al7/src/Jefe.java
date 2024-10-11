class Jefe extends Enemigo {
    public double multiplicadorDeDaño;

    public Jefe(String nombre, int puntosVida, int dañoBase, double multiplicadorDeDaño) {
        super(nombre, puntosVida, dañoBase);
        this.multiplicadorDeDaño = multiplicadorDeDaño;
    }

    @Override
    public int atacar() {
        return (int) (dañoBase * multiplicadorDeDaño);
    }

    public void hablar() {
        System.out.println(nombre + ": ¡Soy el jefe y acabaré contigo!");
    }

    public int ataqueCritico() {
        return (int) (dañoBase * multiplicadorDeDaño * 2);
    }
}
