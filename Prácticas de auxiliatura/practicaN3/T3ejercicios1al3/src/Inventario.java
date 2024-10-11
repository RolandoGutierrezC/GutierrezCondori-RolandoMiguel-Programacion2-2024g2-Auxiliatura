import java.util.ArrayList;

class Inventario {
    private ArrayList<String> items;

    public Inventario() {
        items = new ArrayList<>();
    }

    public void agregarItem(String item) {
        items.add(item);
    }

    public void mostrarItems() {
        System.out.println("Ítems en el inventario:");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }
}



