package black.chapter4.one.optionalTest;

import java.util.Optional;

public class OfTest {
  public static void main(String[] args) {
    Optional<String> sample = Optional.of(null);
    System.out.println(sample);
  }
}
