import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        final Box root = new Box(-999);
        for (int j = 0; j < 10; j++) {
            final Box box = new Box(j);
            root.add(box);
            for (int i = 0; i < 10; i++) {
                String name = String.format("Item_%s", j * 10 + i);
                int value = random.nextInt(1000);
                final Item item = new Item(name, value);
                box.add(item);
            }
        }

        Iterator<Component> dfsIterator = root.iterator();
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = Integer.MIN_VALUE;

        while (dfsIterator.hasNext()) {
            Component component = dfsIterator.next();
            if (component instanceof Item) {
                int value = ((Item) component).getValue();
                if (value < minPrice) minPrice = value;
                if (value > maxPrice) maxPrice = value;
            }
        }

        System.out.println("Cheapest Item: " + minPrice);
        System.out.println("Most Expensive Item: " + maxPrice);
    }
}