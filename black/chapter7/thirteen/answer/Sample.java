package black.chapter7.thirteen.answer;

import java.util.ArrayDeque;
import java.util.Deque;

public class Sample {
  public static void main(String[] args) {
    Deque<String> deque = new ArrayDeque<>();
    deque.addLast("A");
    deque.addLast("B");
    deque.addLast("C");
    deque.addLast("D");

    deque.stream().forEach(System.out::println);
  }
}
