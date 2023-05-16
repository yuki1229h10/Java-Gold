package black.chapter4.seventeen.answer;

public class Item {
  private String name;

  public Item(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
