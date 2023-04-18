package black.chapter4.six.ifPresentOrElse;

import java.util.Optional;

public class IfPresentOrElseTest {
  public static void main(String[] args) {
    Optional<String> sample = Optional.empty();
    sample.ifPresentOrElse((str) -> System.out.println(str), () -> System.out.println("empty"));
  }
}
