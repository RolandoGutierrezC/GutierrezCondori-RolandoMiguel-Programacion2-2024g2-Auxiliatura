class Moto extends Vehiculo implements Turbo {
    public Moto(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public void acelerar() {
        System.out.println("La moto " + marca + " " + modelo + " está acelerando!");
    }

    @Override
    public void activarTurbo() {
        System.out.println("La moto ha activado el turbo!");
    }
}

