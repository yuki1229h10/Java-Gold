package black.chapter2.two.supplier;

// public class Sample {
// public static void main(String[] args) {
// Test test = new Test();
// test.execute();
// }
// }

public class Sample {
  public static void main(String[] args) {
    Test test = new Test();
    test.execute(() -> new B());
  }
}
