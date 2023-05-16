package black.chapter4.seventeen.answer;

import java.util.Arrays;
import java.util.List;

public class SortSample2 {
  public static void main(String[] args) {
    List<Item> list = Arrays.asList(
        new Item("A"),
        new Item("C"),
        new Item("B"));
    list.stream().sorted((a, b) -> a.getName().compareTo(b.getName())).forEach(System.out::println);
  }
}
