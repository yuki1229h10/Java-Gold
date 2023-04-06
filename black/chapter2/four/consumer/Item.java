package black.chapter2.four.consumer;

import java.util.function.Consumer;
import java.lang.module.ModuleDescriptor.Builder;

public class Item {
  private int id;
  private String name;
  private int price;

  private Item(Builder builder) {
    this.id = builder.id;
    this.name = builder.name;
    this.price = builder.price;
  }

  @Override
  public String toString() {
    return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
  }

  public static class Builder {

    private int id;
    private String name;
    private int price;

    public Builder(int id) {
      this.id = id;
    }

    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    public Builder setPrice(int price) {
      this.price = price;
      return this;
    }

    public Item build() {
      return new Item(this);
    }
  }
}
