class Vaca extends Animal implements Productor {
    public Vaca(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Muuu!");
    }

    @Override
    public void producir() {
        System.out.println(nombre + " está produciendo leche.");
    }
}

