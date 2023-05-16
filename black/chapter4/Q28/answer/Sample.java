package black.chapter4.Q28.answer;

import java.util.Arrays;
import java.util.stream.Stream;

public class Sample {
  public static void main(String[] args) {
    String[] array = { "A", "B", "C" };
    Stream<String> stream = Arrays.stream(array);
    stream.forEach(System.out::println);
    stream.forEach(System.out::println);
  }
}
