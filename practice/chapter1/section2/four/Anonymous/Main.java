package practice.chapter1.section2.four.anonymous;


public class Main {
  public static void main(String[] args) {
    Pocket<Object> pocket = new Pocket<>();
    System.out.println("使い捨てのインスタンスを作りpocketに入れます");
    /** メンバを二つ持つ匿名クラスを定義して宣言すると同時にインスタンス化 */
    pocket.put(new Object() {
      String innerField;

      void innerMethod() {

      }
    });
  }
}
