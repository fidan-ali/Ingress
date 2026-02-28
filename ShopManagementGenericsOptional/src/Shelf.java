import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Shelf<T extends Product> {

    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public List<T> getAllItems() {
        return items;
    }

    public Optional<T> findProductByName(String name) {

        for (T item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                return Optional.of(item);
            }
        }

        return Optional.empty();
    }
}