package black.chapter4.Q2.answer;

import java.util.Optional;

public class GetTest3 {
  public static void main(String[] args) {
    Optional<String> sample = Optional.empty();
    if (sample.isPresent()) {
      System.out.println(sample.get());
    }
  }
}
