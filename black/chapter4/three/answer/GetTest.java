package black.chapter4.three.answer;

import java.util.Optional;

public class GetTest {
  public static void main(String[] args) {
    Optional<String> sample = Optional.empty();
    System.out.println(sample.orElse("empty"));
  }
}
