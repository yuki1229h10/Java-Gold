package black.chapter3.Q1.multiple;

public class Example {
  public static void main(String[] args) {
    Thread t = new Thread() {
      @Override
      public synchronized void start() {
        super.start();
        System.out.println("A");
      }

      @Override
      public void run() {
        super.run();
        System.out.println("B");
      }
    };
    t.start();
  }
}
