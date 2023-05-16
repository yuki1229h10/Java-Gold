package black.chapter4.fourteen.answer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterSample2 {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    Stream<Integer> a = list.stream();
    Stream<Integer> b = a.filter(x -> x % 2 == 0);
    b.forEach(System.out::println);
  }
}
