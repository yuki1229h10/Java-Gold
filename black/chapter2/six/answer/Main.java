package black.chapter2.six.answer;

import java.util.function.Predicate;

public class Main {
  public static void main(String[] args) {
    Predicate<String> p1 = x -> x.isEmpty();
    System.out.println(p1.test(""));
  }
}
