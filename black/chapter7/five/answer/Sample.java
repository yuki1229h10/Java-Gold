package black.chapter7.five.answer;

public class Sample {
  public static void main(String[] args) {
    Test<A> a = new Test<>();
    Test<B> b = new Test<>();
    Test<C> c = new Test<>();

    a.execute(new A());
    b.execute(new B());
    c.execute(new B());
  }
}
