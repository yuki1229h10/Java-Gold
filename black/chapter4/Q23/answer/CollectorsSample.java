package black.chapter4.Q23.answer;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsSample {
  public static void main(String[] args) {
    List<Item> list = Arrays.asList(
        new Item(1, ItemType.BOOK, "Java", 1980),
        new Item(2, ItemType.BOOK, "Lambda", 2980),
        new Item(3, ItemType.MAGAZINE, "Software", 980),
        new Item(4, ItemType.MAGAZINE, "Test", 1280));

    // List<Item> books = list.stream().filter(item -> item.getType() ==
    // ItemType.BOOK).collect(Collectors.toList());

    /**
     * java.util.Setの場合
     */
    Set<Item> books = list.stream().filter(item -> item.getType() == ItemType.BOOK).collect(Collectors.toSet());

    books.forEach(System.out::println);

  }
}
