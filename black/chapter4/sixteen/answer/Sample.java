package black.chapter4.sixteen.answer;

import java.util.List;

public class Sample {
  public static void main(String[] args) {
    List<Integer> list = List.of(1, 2, 3, 4, 5);
    list.parallelStream().findAny().ifPresent(System.out::println);
  }
}
