package black.chapter8.one.answer;

import java.util.ArrayList;
import java.util.List;

public class Sample {
  private List<Object> list = new ArrayList<>();

  public void add(Object obj) {
    if (obj instanceof Test) {
      this.list.add(obj);
    }
  }
}
