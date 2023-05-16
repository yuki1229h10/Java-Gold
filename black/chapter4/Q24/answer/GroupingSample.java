package black.chapter4.Q24.answer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingSample {
  public static void main(String[] args) {
    List<Item> list = Arrays.asList(
        new Item(1, ItemType.BOOK, "java", 1980),
        new Item(2, ItemType.BOOK, "Lambda", 2980),
        new Item(3, ItemType.MAGAZINE, "Software", 980),
        new Item(4, ItemType.MAGAZINE, "Test", 1280));

    Map<ItemType, List<Item>> group = list.stream().collect(Collectors.groupingBy(Item::getType));

    System.out.println(group);
  }
}
