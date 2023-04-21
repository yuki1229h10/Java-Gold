package black.chapter4.twentyThree.answer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsSample2 {
  public static void main(String[] args) {
    List<Item> list = Arrays.asList(
        new Item(1, ItemType.BOOK, "Java", 1980),
        new Item(2, ItemType.BOOK, "Lambda", 2980),
        new Item(3, ItemType.MAGAZINE, "Software", 980),
        new Item(4, ItemType.MAGAZINE, "Test", 1280));

    Map<String, Item> map = list.stream().collect(Collectors.toMap(Item::getName, item -> item));

    map.keySet().stream().forEach(System.out::println);
  }
}
