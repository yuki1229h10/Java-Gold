package black.chapter1.four.answer;

public class Outer {
  private static String message = "Hello, Java";

  static class Inner {
    public void test() {
      System.out.println(message);
    }
  }
}
