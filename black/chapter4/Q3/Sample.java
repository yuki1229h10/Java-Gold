package black.chapter4.Q3;

import java.util.Optional;

public class Sample {
  public static void main(String[] args) {
    Optional<String> sample = Optional.of("A");
    System.out.println(sample.orElse("B"));
  }
}
