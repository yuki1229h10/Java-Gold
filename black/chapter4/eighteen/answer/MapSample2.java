package black.chapter4.eighteen.answer;

import java.util.Arrays;

public class MapSample2 {
  public static void main(String[] args) {
    String[] fruits = { "apple", "orange", "banana" };
    Arrays.stream(fruits).map(f -> f.length()).forEach(System.out::println);
  }
}
