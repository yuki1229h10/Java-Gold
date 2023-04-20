package black.chapter4.twentyOne.answer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Test3 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    Consumer<String> c = str -> {
      list.add(str);
    };
    Test2.execute(c);
    System.out.println(list.size());
  }
}
