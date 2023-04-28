package black.chapter7.eight;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
  public static void main(String[] args) {
    List<? extends Number> list = new ArrayList<Integer>();
    list.add(10);
    list.add(10);
    list.add(10);

    for (Number n : list) {
      System.out.println(n);
    }
  }
}
