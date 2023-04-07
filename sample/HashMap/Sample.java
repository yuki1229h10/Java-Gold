package sample.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Sample {
  public static void main(String[] args) {
    Map<String, Product> map = new HashMap<>();
    map.put("pencil", new Product("pencil", 100));
    map.put("eraser", new Product("eraser", 60));
    map.put("note", new Product("note", 80));
    Product product = map.get("eraser");
    System.out.println(product);
    map.keySet().forEach(System.out::println);
    map.values().forEach(System.out::println);
  }
}

class Product {
  private String productName;
  private int price;

  public Product(String productName, int price) {
    this.productName = productName;
    this.price = price;
  }

  public String toString() {
    return this.productName + "," + this.price;
  }
}
