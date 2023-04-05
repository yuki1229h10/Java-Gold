package practice.chapter1.section1.three.equals;

public class Account {
  String accountNo;

  /** クラスを作成したら必ずequalsはオーバーライドしておく */
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (o == null)
      return false;
    if (!(o instanceof Account))
      return false;
    Account r = (Account) o;
    if (!this.accountNo.trim().equals(r.accountNo.trim())) {
      return false;
    }
    return true;
  }
}
