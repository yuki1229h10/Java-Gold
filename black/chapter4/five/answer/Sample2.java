package black.chapter4.five.answer;

import java.util.Optional;

public class Sample2 {
  public static void main(String[] args) {
    Optional<String> sample = Optional.empty();
    sample.ifPresent((str) -> System.out.println(str));
  }
}
