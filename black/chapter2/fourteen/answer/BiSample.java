package black.chapter2.fourteen.answer;

import java.util.function.BinaryOperator;

public class BiSample {
  public static void main(String[] args) {
    BinaryOperator<String> b = (str, add) -> str.concat(add);
    System.out.println(b.apply("Hello, ", "Lambda"));
  }
}
