import java.util.*;

class ShopIterator implements Iterator<ShopItem> {
    private final Iterator<ShopItem> iterator;

    public ShopIterator(Collection<ShopItem> items, Shop.SortOrder sortOrder) {
        List<ShopItem> sortedItems = new ArrayList<>(items);
        if (sortOrder == Shop.SortOrder.BY_NAME) {
            sortedItems.sort(Comparator.comparing(ShopItem::getName));
        } else if (sortOrder == Shop.SortOrder.BY_QUANTITY) {
            sortedItems.sort(Comparator.comparing(ShopItem::getQuantity).reversed());
        }
        iterator = sortedItems.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public ShopItem next() {
        return iterator.next();
    }
}