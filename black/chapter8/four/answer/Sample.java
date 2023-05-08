package black.chapter8.four.answer;

public class Sample {
  @NotNull(message = "name is not allowed null")
  private String name;

  public Sample(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}
