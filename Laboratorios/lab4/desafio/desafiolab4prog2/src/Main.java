public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct(new Electronic("Laptop", 1000.0));
        store.addProduct(new Electronic("Smartphone", 500.0));
        store.addProduct(new Accessory("Mouse", 50.0));
        store.addProduct(new Accessory("Keyboard", 80.0));
        store.addProduct(new Accessory("Headphones", 120.0)); 
        store.addProduct(new Accessory("Charger", 30.0));    
        
        Discountable tenPercentDiscount = product -> product.getPrice() * 0.9;
        System.out.println("Applying 10% discount:");
        store.applyDiscount(tenPercentDiscount);

        Discountable fiftyDollarsDiscount = product -> product.getPrice() - 50.0;
        System.out.println("\nApplying fixed discount of $50:");
        store.applyDiscount(fiftyDollarsDiscount);

        Discountable variableAccessoryDiscount = product -> {
            if (product instanceof Accessory) {
                return product.getPrice() * 0.85; 
            }
            return product.getPrice(); 
        };
        System.out.println("\nApplying 15% discount to accessories:");
        store.applyDiscount(variableAccessoryDiscount);

        Discountable combinedDiscount = product -> {
            double discountedPrice = product.getPrice() * 0.9; 
            return discountedPrice - 20.0; 
        };
        System.out.println("\nApplying combined discount (10% + $20):");
        store.applyDiscount(combinedDiscount);
    }
}


