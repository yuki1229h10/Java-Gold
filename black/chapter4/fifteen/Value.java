package black.chapter4.fifteen;

public class Value {
  private String data;

  public Value(String data) {
    this.data = data;
  }

  @Override
  public int hashCode() {
    return 100;
  }

  @Override
  public boolean equals(Object obj) {
    return true;
  }
}
