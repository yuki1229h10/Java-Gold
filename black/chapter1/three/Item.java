package black.chapter1.three;

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
}
