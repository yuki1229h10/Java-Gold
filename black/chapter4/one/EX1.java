package black.chapter4.one;

import java.lang.StackWalker.Option;
import java.util.Optional;

public class EX1 {
  public static void main(String[] args) {
    Optional<String> sample = Optional.of(null);
    System.out.println(sample);
  }
}
