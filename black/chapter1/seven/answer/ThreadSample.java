package black.chapter1.seven.answer;

public class ThreadSample {
  public static void main(String[] args) {
    Runnable run = new Runnable() {
      @Override
      public void run() {
        System.out.println("Hello");
      }
    };
  }
}
