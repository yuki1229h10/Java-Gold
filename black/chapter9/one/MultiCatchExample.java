package black.chapter9.one;

public class MultiCatchExample {
  public static void main(String[] args) {
    try {
      String str = null;
      System.out.println(str.length());
    } catch (NullPointerException | ArithmeticException ex) {
      System.out.println("NullPointerException、または ArithmeticExceptionが発生しました。");
      ex.printStackTrace();
    }
  }
}
