package black.chapter3.Q16.answer;

import java.util.List;

public class ReadTask implements Runnable {
  private List<Integer> list;

  public ReadTask(List<Integer> list) {
    this.list = list;
  }

  @Override
  public void run() {
    try {
      for (Integer i : list) {
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
        System.out.println(i);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
