package OrderPricingSystem;

public abstract class Order {
    double basePrice;

    public Order(double basePrice) {
        this.basePrice = basePrice;
    }

    public abstract double calculateTotal();
}
