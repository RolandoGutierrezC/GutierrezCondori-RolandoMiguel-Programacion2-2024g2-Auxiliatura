
class Enemigo {
    public String nombre;
    public int puntosVida;
    public int dañoBase;

    public Enemigo(String nombre, int puntosVida, int dañoBase) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.dañoBase = dañoBase;
    }

    public int atacar() {
        return dañoBase;
    }

    public void recibirDanio(int daño) {
        puntosVida -= daño;
        if (puntosVida < 0) {
            puntosVida = 0; 
        }
    }

    public boolean estaVivo() {
        return puntosVida > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarEstado() {
        System.out.println("Estado de " + nombre + ": " + puntosVida + " Puntos de Vida");
    }
}

