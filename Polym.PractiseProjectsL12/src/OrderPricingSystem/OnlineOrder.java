package OrderPricingSystem;

public class OnlineOrder extends Order{
    double deliveryFee;

    public OnlineOrder(double basePrice, double deliveryFee) {
        super(basePrice);
        this.deliveryFee = deliveryFee;
    }

    @Override
    public double calculateTotal() {
        return basePrice + deliveryFee;
    }
}
