package black.chapter1.twelve;

public interface A {
  default void test() {
    System.out.println("A");
  }
}
