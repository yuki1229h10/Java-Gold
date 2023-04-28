package black.chapter7.two.answer;

import java.util.ArrayList;
import java.util.List;

public class ItemList {
  private List list = new ArrayList();

  public void add(Item item) {
    this.list.add(item);
  }

  public Item get(int index) {
    return (Item) this.list.get(index);
  }

  public int size() {
    return this.list.size();
  }
}
