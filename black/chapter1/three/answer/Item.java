package black.chapter1.three.answer;

import java.util.Comparator;

public class Item implements Comparable<Item> {
  private String name;
  private int price;

  public Item(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  @Override
  public int compareTo(Item target) {
    return name.compareTo(target.name);
  }

  // public class PriceComparator implements Comparator<Item> {
  // @Override
  // public int compare(Item a, Item b) {
  // if (a.price < b.price) {
  // return -1;
  // }
  // if (b.price < a.price) {
  // return 1;
  // }
  // return 0;
  // }
  // }

  /**
   * インナークラスをstaticで修飾する。
   */
  public static class PriceComparator implements Comparator<Item> {
    @Override
    public int compare(Item a, Item b) {
      if (a.price < b.price) {
        return -1;
      }
      if (b.price < a.price) {
        return 1;
      }
      return 0;
    }
  }
}
