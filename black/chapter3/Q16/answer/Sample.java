package black.chapter3.Q16.answer;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sample {
  public static void main(String[] args) {
    List<Integer> list = new CopyOnWriteArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);

    ExecutorService exec = Executors.newFixedThreadPool(2);
    exec.submit(new WriteTask(list));
    exec.submit(new ReadTask(list));

    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    exec.shutdown();
  }
}
