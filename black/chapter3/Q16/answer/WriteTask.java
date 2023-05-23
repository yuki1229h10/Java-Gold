package black.chapter3.Q16.answer;

import java.util.List;

public class WriteTask implements Runnable {
  private List<Integer> list;

  public WriteTask(List<Integer> list) {
    this.list = list;
  }

  @Override
  public void run() {
    for (int i = 10; i < 20; i++) {
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      list.add(i);
    }
  }
}
