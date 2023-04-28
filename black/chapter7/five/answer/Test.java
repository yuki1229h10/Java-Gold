package black.chapter7.five.answer;

public class Test<T extends A> {
  public void execute(T t) {
    t.hello();
  }
}
