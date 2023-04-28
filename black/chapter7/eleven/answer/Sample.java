package black.chapter7.eleven.answer;

import java.util.ArrayDeque;
import java.util.Queue;

public class Sample {
  public static void main(String[] args) {
    Queue<String> queue = new ArrayDeque<>(5);
    queue.add("A");
    queue.add("B");
    queue.add("C");
    queue.add("D");
    queue.add("E");

    queue.stream().forEach(System.out::println);
  }
}
