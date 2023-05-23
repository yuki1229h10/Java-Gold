package black.chapter3.Q17.answer;

public class Task implements Runnable {
  private Test test;

  public Task(Test test) {
    super();
    this.test = test;
  }

  @Override
  public void run() {
    test.first();
    test.second();
    test.thrid();
  }
}
