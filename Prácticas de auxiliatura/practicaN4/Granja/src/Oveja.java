class Oveja extends Animal implements Productor {
    public Oveja(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Beee!");
    }

    @Override
    public void producir() {
        System.out.println(nombre + " está produciendo lana.");
    }
}
