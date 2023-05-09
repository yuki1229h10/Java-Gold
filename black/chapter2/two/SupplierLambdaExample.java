package black.chapter2.two;

import java.util.function.Supplier;

public class SupplierLambdaExample {
  public static void main(String[] args) {
    Supplier<String> s = () -> "Hello, Supplier Lambda!";
    String result = s.get();
    System.out.println(result);
  }
}
