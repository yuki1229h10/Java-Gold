package practice.chapter1.section1.four.hashCode;

import java.util.Objects;

public class Hero {
  String name;
  int hp;

  /**
   * hash値の比較は単なる整数同士の比較なのでequals()よりはるかに高速に行うことができる。
   * hash値が一致した場合に限ってequals()を用いて厳密に等価判定を行う。
   */
  public int hashCode() {
    return Objects.hash(this.name, this.hp);
  }
}
