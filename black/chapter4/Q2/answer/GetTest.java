package black.chapter4.Q2.answer;

import java.util.Optional;

public class GetTest {
  public static void main(String[] args) {
    Optional<String> sample = Optional.of("Hello");
    System.out.println(sample.get());
  }
}
