package black.chapter1.eight.answer;

public class Test {
  public static void main(String[] args) {
    Object obj = new Object() {
      @Override
      public String toString() {
        return "hello. ";
      }
    };
  }
}
