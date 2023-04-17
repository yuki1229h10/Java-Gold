package black.chapter4.two.optional;

import java.util.Optional;

public class emptyTest {
  public static void main(String[] args) {
    Optional<String> sample = Optional.empty();
    if (sample.isEmpty()) {
      System.out.println("empty");
      return;
    }
    System.out.println(sample.get());
  }
}
