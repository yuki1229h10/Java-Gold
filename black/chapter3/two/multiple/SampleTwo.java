package black.chapter3.two.multiple;

public class SampleTwo {
  public static void main(String[] args) {
    Thread t = new Thread(() -> {
      System.out.println("sub");
    });
    t.start();

    System.out.println("main");
  }
}
