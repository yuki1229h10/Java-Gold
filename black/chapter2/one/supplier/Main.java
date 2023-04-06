package black.chapter2.one.supplier;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Supplier<List<String>> supplier = () -> new ArrayList();
    List<String> list = supplier.get();
  }
}
