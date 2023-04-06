package black.chapter2.two.supplier;

/** このクラスに関するコードがTestにて一行も記されていないが、以下の文言は表示される */
public class B implements A {
  @Override
  public void hello() {
    System.out.println("Bの独自処理");
  }
}
