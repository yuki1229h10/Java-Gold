package black.chapter4.twentyOne.answer;

import java.util.function.Consumer;

public class Test2 {
  public static void execute(Consumer<String> c) {
    c.accept("Hi");
  }
}
