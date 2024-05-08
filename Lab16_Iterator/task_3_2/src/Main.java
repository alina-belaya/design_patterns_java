import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    ShopItem pens = new ShopItem("pen", 175);
    ShopItem pencils = new ShopItem("pencil", 0);
    ShopItem paper = new ShopItem("paper", 500);

    Shop shop = new Shop();
    shop.putItem(pens);
    shop.putItem(pencils);
    shop.putItem(paper);

    Iterator<ShopItem> nameIterator = shop.iterator(Shop.SortOrder.BY_NAME);
    System.out.println("Items sorted by name:");
    while (nameIterator.hasNext()) {
      System.out.println(nameIterator.next());
    }

    Iterator<ShopItem> quantityIterator = shop.iterator(Shop.SortOrder.BY_QUANTITY);
    System.out.println("\nItems sorted by quantity:");
    while (quantityIterator.hasNext()) {
      System.out.println(quantityIterator.next());
    }
  }
}