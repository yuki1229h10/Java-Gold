package black.chapter2.five;

import java.util.function.BiConsumer;

public class BiConsumerExample {
  public static void main(String[] args) {
    BiConsumer<String, Integer> biConsumer = (str, num) -> System.out.println("String: " + str + ", Integer: " + num);

    biConsumer.accept("Hello", 10);
    biConsumer.accept("Java", 20);
    biConsumer.accept("World", 30);
  }
}
