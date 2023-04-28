package black.chapter7.seven.answer;

public class Sample {
  public static void main(String[] args) {
    Test<?> test = new Test<>("Hello");
    String msg = (String) test.getValue();
    // test.setValue("sample");
    // test.setValue(new Object());
    test.setValue(null);
  }
}
