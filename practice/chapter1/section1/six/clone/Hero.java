package practice.chapter1.section1.six.clone;

/**
 * clone()による複製を採用している事を外部に対して表明している
 * マーカーインタフェースでただの飾り
 */
public class Hero implements Cloneable {
  String name;
  int hp;
  Sword sword;

  /** 浅いコピー */
  public Hero clone() {
    Hero result = new Hero();
    result.name = this.name;
    result.hp = this.hp;
    result.sword = this.sword;
    return result;
  }
}
