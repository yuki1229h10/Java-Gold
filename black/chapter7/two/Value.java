package black.chapter7.two;

public class Value<T> {
  T val;

  public Value(T val) {
    super();
    this.val = val;
  }

  public T getVal() {
    return val;
  }
}
