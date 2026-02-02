package az.edu.lesson6.Shop;

public class MainShop {
    public static void main(String[] args) {

        Product p1 = new Product();
        p1.name = "Laptop";
        p1.price = 1200.0;

        Product p2 = new Product();
        p2.name = "Mouse";
        p2.price = 25.5;

        Product p3 = new Product();
        p3.name = "Keyboard";
        p3.price = 45.0;

        Product[] productArray = {p1, p2, p3};

        Shop myShop = new Shop();
        myShop.products = productArray;

        System.out.println("Ümumi məbləğ: " + myShop.calculateTotalPrice());
    }
}
