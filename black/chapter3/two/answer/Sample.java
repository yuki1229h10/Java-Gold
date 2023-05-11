package black.chapter3.two.answer;

public class Sample {
  public static void main(String[] args) {
    Thread t = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("sub");
      }
    });
    t.start();
    System.out.println("main");
  }
}
