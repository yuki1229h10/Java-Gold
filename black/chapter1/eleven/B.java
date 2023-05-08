package black.chapter1.eleven;

public interface B {
  default void test() {
    System.out.println("B");
  }
}
