package black.chapter4.one.optionalTest;

import java.util.Optional;

public class avoidNull {
  public static void main(String[] args) {
    Optional<String> sample = Optional.ofNullable(null);
    System.out.println(sample);
  }
}
