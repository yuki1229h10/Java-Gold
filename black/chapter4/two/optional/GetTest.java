package black.chapter4.two.optional;

import java.util.Optional;

public class GetTest {
  public static void main(String[] args) {
    Optional<String> sample = Optional.empty();
    System.out.println(sample.get());
  }
}
