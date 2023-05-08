package black.chapter1.eleven;

public class Sample implements A, D {
  @Override
  public void test() {
    A.super.test();
  }
}
