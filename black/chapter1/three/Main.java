package black.chapter1.three;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Item> items = Arrays.asList(
        new Item[] {
            new Item("orange", 100),
            new Item("banana", 80),
            new Item("apple", 120)
        });
    Collections.sort(items);
    for (Item item : items) {
      System.out.println(item.getName());
    }
  }
}
