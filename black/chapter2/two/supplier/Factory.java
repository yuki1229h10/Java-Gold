package black.chapter2.two.supplier;

public class Factory {
  public static A create() {
    return new B();
  }
}
