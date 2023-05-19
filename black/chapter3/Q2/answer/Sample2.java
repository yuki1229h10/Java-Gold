package black.chapter3.Q2.answer;

public class Sample2 {
  public static void main(String[] args) {
    Thread t = new Thread(() -> {
      System.out.println("sub");
    });
    t.start();

    System.out.println("main");
  }
}
