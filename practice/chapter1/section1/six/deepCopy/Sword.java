package practice.chapter1.section1.six.deepCopy;

public class Sword implements Cloneable {
  private String name;

  public Sword clone() {
    Sword result = new Sword();
    result.name = this.name;
    return result;
  }
}
