package black.chapter2.thirteen.unaryOperator;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("c");

    list.replaceAll(x -> x.toUpperCase());
    for (String str : list) {
      System.out.println(str);
    }
  }
}