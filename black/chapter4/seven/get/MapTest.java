package black.chapter4.seven.get;

import java.util.Optional;

public class MapTest {
  public static void main(String[] args) {
    Optional<String> sample = Optional.of("test");
    Optional<String> result = null;
    if (sample.isPresent()) {
      String str = sample.get();
      result = Optional.of(str.toUpperCase());
    }
    System.out.println(sample.get());
    System.out.println(result.get());
  }
}
