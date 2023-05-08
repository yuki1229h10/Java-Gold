package black.chapter1.six.answer;

public class IllegalAccessSample {
  public void test() {
    String name = "sample";
    class Sample {
      public void hello() {
        System.out.println("Hello, " + name);
      }
    }
    new Sample().hello();
  }
}
