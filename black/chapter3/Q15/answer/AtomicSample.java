package black.chapter3.Q15.answer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AtomicSample {
  public static void main(String[] args) {
    Value val = new AtomicValue();

    ExecutorService exec = Executors.newFixedThreadPool(2);
    exec.submit(new Task(val));
    exec.submit(new Task(val));

    try {
      Thread.sleep(200);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    System.out.println(val.get());
    exec.shutdown();
  }
}
