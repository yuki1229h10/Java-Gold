package black.chapter4.two.answer;

import java.util.Optional;

public class GetTest {
  public static void main(String[] args) {
    Optional<String> sample = Optional.of("Hello");
    System.out.println(sample.get());
  }
}
