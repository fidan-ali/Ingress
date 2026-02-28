import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Shelf<Electronics> electronicsShelf = new Shelf<>();

        Electronics reader = new Electronics(1, "E-reader", 480, 12);
        Electronics laptop = new Electronics(2, "Laptop", 3000, 12);

        electronicsShelf.addItem(reader);
        electronicsShelf.addItem(laptop);

        Shelf<Clothes> clothesShelf = new Shelf<>();

        Clothes jeans = new Clothes(3, "Jeans", 90, "S");
        Clothes jacket = new Clothes(4, "Jacket", 130, "XS");

        clothesShelf.addItem(jeans);
        clothesShelf.addItem(jacket);

        clothesShelf.removeItem(jeans);

        Optional<Electronics> foundProduct = electronicsShelf.findProductByName("E-reader");

        if (foundProduct.isPresent()) {
            Electronics p = foundProduct.get();
            System.out.println("Product: " + p.getName() + ", Price: " + p.getPrice());
        } else {
            System.out.println("Product not found");
        }

        Optional<Clothes> notFound = clothesShelf.findProductByName("Jeans");

        System.out.println(notFound.orElse(null));
    }
}