package practice.chapter1.section2.five.avoidNull;

import java.util.Optional;

public class Main {
  public static Optional<String> decorate(String s, char c) {
    String r;
    if (s == null || s.length() == 0) {
      r = null;
    } else {
      r = c + s + c;
    }
    return Optional.ofNullable(r);
  }

  public static void main(String[] args) {
    Optional<String> s = decorate("", '*');
    // Optional<String> s = decorate("100", '*');
    System.out.println(s.orElse("nullのため処理できません"));
  }
}
