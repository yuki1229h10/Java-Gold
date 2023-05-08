package black.chapter1.six;

public class Sample {
  private String mesage;

  public Test test(String value) {
    class A implements Test {
      @Override
      public void execute() {
        System.out.println(message + value);
      }
    }
    value = "LocalClass";
    message = "Hello, ";
    return new A();
  }
}
