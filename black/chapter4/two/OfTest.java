package black.chapter4.two;

import java.util.Optional;

public class OfTest {
  public static void main(String[] args) {
    Optional<String> sample = Optional.ofNullable(null);
    System.out.println(sample.get());
  }
}
