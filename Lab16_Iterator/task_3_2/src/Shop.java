import java.util.HashMap;
import java.util.Iterator;

class Shop implements Iterable<ShopItem> {
    private final HashMap<String, ShopItem> items = new HashMap<>();

    public enum SortOrder {
        BY_NAME,
        BY_QUANTITY
    }

    void putItem(ShopItem item) {
        items.put(item.getName(), item);
    }

    @Override
    public Iterator<ShopItem> iterator() {
        return new ShopIterator(items.values(), SortOrder.BY_NAME);
    }

    public Iterator<ShopItem> iterator(SortOrder order) {
        return new ShopIterator(items.values(), order);
    }
}