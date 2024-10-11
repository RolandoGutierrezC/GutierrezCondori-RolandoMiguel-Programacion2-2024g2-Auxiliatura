
class Arquero extends Personaje {
    public int destreza;

    public Arquero(String nombre, int nivel, int puntosVida, int destreza) {
        super(nombre, nivel, puntosVida);
        this.destreza = destreza;
    }

    public void dispararFlecha() {
        System.out.println(nombre + " ha disparado una flecha.");
    }
}