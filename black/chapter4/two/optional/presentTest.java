package black.chapter4.two.optional;

import java.util.Optional;

public class presentTest {
  public static void main(String[] args) {
    Optional<String> sample = Optional.empty();
    if (sample.isPresent()) {
      System.out.println(sample.get());
    }
  }
}
