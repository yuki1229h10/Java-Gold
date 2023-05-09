package black.chapter2.one.supplier;

import java.util.function.Supplier;

public class SupplierExample {
  public static void main(String[] args) {
    Supplier<String> supplier = () -> "Hello, Supplier!";
    String result = supplier.get();
    System.out.println(result);
  }
}
