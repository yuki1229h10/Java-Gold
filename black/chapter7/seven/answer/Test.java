package black.chapter7.seven.answer;

public class Test<T> {
  T value;

  public Test(T value) {
    super();
    this.value = value;
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }
}
