package practice.chapter1.section2.four;

public class Outer {
  int outerField;
  static int outerStaticField;

  static class Inner {
    void innerMethod() {
      outerStaticField = 10;
    }
  }

  void outerMethod() {
    Inner ic = new Inner();
  }
}
