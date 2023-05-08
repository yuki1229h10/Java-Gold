package black.chapter1.three.answer;

import java.util.Comparator;

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
