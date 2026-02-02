package az.edu.lesson6.Shop;

public class Shop {
    Product[] products = new Product[5];
    double sum=0;
    public double calculateTotalPrice(){
        for(int i=0; i<products.length; i++){
            sum+=products[i].price;
        }
        return sum;
    }
}
