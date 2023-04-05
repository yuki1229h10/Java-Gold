package sample.ArrayList;

import java.util.ArrayList;

public class ArrayListSample {
  /**
   * ArrayListは要素数が動的に変わるため、メモリの使用効率が良い
   * コレクションクラスの一つ
   */
  public static void main(String args[]) {
    ArrayList<String> list = new ArrayList<String>();
    System.out.println(list.size());
    list.add("Java入門講座");
    list.add("ここまで");
    list.add("よく頑張りましたね！");
    System.out.println(list.size());

    list.remove(1);
    System.out.println(list.size());

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
