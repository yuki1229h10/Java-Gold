package black.chapter4.seventeen.answer;

import java.util.Arrays;
import java.util.List;

public class SortSample {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("A", "B", "C", "A");
    list.stream().sorted().forEach(System.out::println);
  }
}
