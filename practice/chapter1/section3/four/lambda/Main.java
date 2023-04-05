package practice.chapter1.section3.four.lambda;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<Account> list = new ArrayList<>();

    Collections.sort(list, (x, y) -> (x.zandaka - y.zandaka));
  }
}
