package black.chapter3.Q1.answer;

public class Sample {
  public static void main(String[] args) {
    Thread t = new SampleThread();
    t.start();

    System.out.println("main");
  }
}
