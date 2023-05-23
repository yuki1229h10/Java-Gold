package black.chapter3.Q15.answer;

public class Task implements Runnable {
  private Value val;

  public Task(Value val) {
    this.val = val;
  }

  @Override
  public void run() {
    this.add(100);
  }

  private void add(int num) {
    this.val.add(num);
  }
}
