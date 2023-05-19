package black.chapter3.Q3.answer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sample2 {
  public static void main(String[] args) {
    ExecutorService exec = Executors.newFixedThreadPool(3);
    for (int i = 0; i < 5; i++) {
      exec.submit(() -> {
        System.out.println(Thread.currentThread().getId());
      });
    }
  }
}
