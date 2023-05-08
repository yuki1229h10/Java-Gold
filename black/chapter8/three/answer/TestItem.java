package black.chapter8.three.answer;

import black.chapter1.three.Item;
import black.chapter7.two.Test;

public class TestItem {
  public static void main(String[] args) {
    Class<Item> clazz = Item.class;
    Test test = clazz.getAnnotation(Test.class);

    if (test == null) {
      return;
    }
  }
}
