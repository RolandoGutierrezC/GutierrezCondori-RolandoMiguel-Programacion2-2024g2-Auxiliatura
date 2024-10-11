public class MainJuegoDeCarreras {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 180);
        coche.mostrarInfo();
        coche.acelerar();
        coche.frenar();

        Moto moto = new Moto("Yamaha", "R1", 300);
        moto.mostrarInfo();
        moto.acelerar();
        moto.activarTurbo();
        moto.frenar();
    }
}

