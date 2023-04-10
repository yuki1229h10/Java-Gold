package black.chapter1.three.priceComparator;

import java.util.Comparator;
import black.chapter1.three.Item;

public class PriceComparator implements Comparator<Item> {
  @Override
  public int compare(Item a, Item b) {
    if (a.getPrice() < b.getPrice()) {
      return -1;
    }
    if (b.getPrice() < a.getPrice()) {
      return 1;
    }
    return 0;
  }
}
