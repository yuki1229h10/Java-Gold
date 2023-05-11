package black.chapter3.two.answer;

public class Sample2 {
  public static void main(String[] args) {
    Thread t = new Thread(() -> {
      System.out.println("sub");
    });
    t.start();

    System.out.println("main");
  }
}
