package black.chapter4.Q1.answer;

import java.util.Optional;

public class OfTest2 {
  public static void main(String[] args) {
    Optional<String> sample = Optional.ofNullable(null);
    System.out.println(sample);
  }
}
