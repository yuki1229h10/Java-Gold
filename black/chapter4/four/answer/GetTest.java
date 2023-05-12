package black.chapter4.four.answer;

import java.util.Optional;

public class GetTest {
  public static void main(String[] args) throws Exception {
    Optional<String> sample = Optional.empty();
    System.out.println(
        sample.orElseThrow(() -> new Exception()));
  }
}
