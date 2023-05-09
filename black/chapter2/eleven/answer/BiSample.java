package black.chapter2.eleven.answer;

import java.util.function.BiFunction;

public class BiSample {
  public static void main(String[] args) {
    BiFunction<String, String, String> b = (str, addStr) -> str.concat(addStr);

    String result = b.apply("Hello, ", "Lambda");
    System.out.println(result);
  }
}
