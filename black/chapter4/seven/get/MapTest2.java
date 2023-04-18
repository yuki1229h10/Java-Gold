package black.chapter4.seven.get;

import java.util.Optional;

public class MapTest2 {
  public static void main(String[] args) {
    Optional<String> sample = Optional.of("test");
    Optional<String> result = sample.map(str -> str.toUpperCase());
    System.out.println(sample.get());
    System.out.println(result.get());
  }
}
