package black.chapter4.ten.answer;

import java.util.List;

public class Sample2 {
  public static void main(String[] args) {
    List<Integer> list = List.of(1, 2, 3, 4, 5);
    list.stream().forEach(System.out::println);
  }
}
