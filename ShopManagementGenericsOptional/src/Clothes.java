public class Clothes extends Product {

    private String size;

    public Clothes(int id, String name, double price, String size) {
        super(id, name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return super.toString() + ", size=" + size;
    }
}