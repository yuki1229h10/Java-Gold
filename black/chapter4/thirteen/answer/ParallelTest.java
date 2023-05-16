package black.chapter4.thirteen.answer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelTest {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("A", "B", "C", "D", "E");
    Stream<String> stream = list.parallelStream();
    stream.forEach(System.out::println);
  }
}
