package black.chapter3.Q2.multiple;

public class SampleTwo {
  public static void main(String[] args) {
    Thread t = new Thread(() -> {
      System.out.println("sub");
    });
    t.start();

    System.out.println("main");
  }
}
