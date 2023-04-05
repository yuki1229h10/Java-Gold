package practice.chapter1.section1.two.toString;

public class Hero {
  private String name;
  private int hp, mp;

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "勇者(名前=" + this.name + "/HP=" + this.hp + "/MP=" + this.mp + ")";
  }
}
