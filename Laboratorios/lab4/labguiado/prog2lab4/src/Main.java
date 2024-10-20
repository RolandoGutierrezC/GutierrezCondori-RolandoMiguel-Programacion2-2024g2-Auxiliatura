public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct(new Electronic("Laptop", 1000.0));
        store.addProduct(new Electronic("Smartphone", 500.0));

        Discountable tenPercentDiscount = product -> product.getPrice() * 0.9;
        store.applyDiscount(tenPercentDiscount);

        Discountable fiftyDollarsDiscount = product -> product.getPrice() - 50.0;
        store.applyDiscount(fiftyDollarsDiscount);
    }
}


