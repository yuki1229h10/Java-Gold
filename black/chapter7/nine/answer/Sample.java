package black.chapter7.nine.answer;

public class Sample {
  public static void main(String[] args) {
    Test<? super B> a = new Test<A>(new A());
    Test<? super B> b = new Test<B>(new B());

    /**
     * 型パラメータにはBもしくはより上位しか使えないのでコンパイルエ ラー
     */
    // Test<? super B> c = new Test<C>(new C());

    /**
     * AはBのサブクラスではないのでコンパイルエラー
     */
    // a.setValue(new A());
    a.setValue(new B());
    b.setValue(new C());

    /**
     * 取り出すときには何型が入っているかが不定なためObject型になる
     */
    Object objA = a.getValue();
    Object objB = b.getValue();

    /**
     * 任意の型で扱う場合にはキャスト式が必要(ただし安全でない)
     */
    A aObj = (A) a.getValue();
    B bObj = (B) b.getValue();
  }
}
