package OrderPricingSystem;

public class StoreOrder extends Order{
    double disCount;

    public StoreOrder(double basePrice, double disCount) {
        super(basePrice);
        this.disCount = disCount;
    }

    @Override
    public double calculateTotal() {
        return basePrice - (basePrice * disCount / 100);
    }
}
