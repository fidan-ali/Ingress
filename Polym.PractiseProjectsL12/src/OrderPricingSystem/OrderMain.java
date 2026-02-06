package OrderPricingSystem;
public class OrderMain {
    public static void main(String[] args) {
        Order online = new OnlineOrder(250 , 5);
        Order store = new StoreOrder(90, 10);

        double onlineTotal = online.calculateTotal();
        double storeTotal = store.calculateTotal();
        System.out.println("Online order: " + onlineTotal);
        System.out.println("Store order: " + storeTotal);

    }
}
