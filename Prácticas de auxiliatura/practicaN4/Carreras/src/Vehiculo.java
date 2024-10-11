abstract class Vehiculo {
    public String marca;
    public String modelo;
    public int velocidadMaxima;

    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public abstract void acelerar();

    public void mostrarInfo() {
        System.out.println("Vehículo: " + marca + " " + modelo + ", Velocidad máxima: " + velocidadMaxima + " km/h");
    }
    public void frenar() {
        System.out.println("El vehículo " + marca + " " + modelo + " está frenando.");
    }
    
}
