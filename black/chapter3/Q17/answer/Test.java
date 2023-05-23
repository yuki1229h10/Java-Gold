package black.chapter3.Q17.answer;

public class Test {
  public void first() {
    System.out.println(Thread.currentThread().getId() + ":1");
  }

  public void second() {
    System.out.println(
        Thread.currentThread().getId() + ":2");
  }

  public void thrid() {
    System.out.println(
        Thread.currentThread().getId() + ":3");
  }
}
