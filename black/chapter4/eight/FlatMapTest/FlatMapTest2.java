package black.chapter4.eight.FlatMapTest;

import java.util.Optional;

public class FlatMapTest2 {
  public static void main(String[] args) {
    Optional<String> a = Optional.of("test");
    Optional<String> b = a.flatMap(str -> test(str));
    System.out.println(b.get());
  }

  private static Optional<String> test(String str) {
    return Optional.of(str.toUpperCase());
  }
}
