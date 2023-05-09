package black.chapter2.four;

import java.util.function.Consumer;

public class ConsumerExample {
  public static void main(String[] args) {
    Consumer<String> c = x -> System.out.println("Length of \"" + x + "\": " + x.length());

    c.accept("Hello");
    c.accept("Java");
    c.accept("World");
  }
}
