
class Personaje {
    protected String nombre;
    protected int nivel;
    protected int puntosVida;
    protected Inventario inventario;

    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.inventario = new Inventario();
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Puntos de Vida: " + puntosVida);
    }

    public void recibirDanio(int daño) {
        puntosVida -= daño;
        if (puntosVida < 0) {
            puntosVida = 0; 
        }
    }

    public void curar() {
        puntosVida += 20;
    }

    public Inventario getInventario() {
        return inventario;
    }
}

