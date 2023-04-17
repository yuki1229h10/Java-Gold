package black.chapter4.one.optionalTest;

import java.util.Optional;

public class Test {
  public static void main(String[] args) {
    Optional<String> result = getFromArray(new String[] { "A", "B", null }, 3);
    if (result.isEmpty()) {
      System.out.println("empty");
      return;
    }
    System.out.println(result.get());
  }

  private static <T> Optional<T> getFromArray(T[] array, int index) {
    if (array == null) {
      return Optional.empty();
    }
    try {
      return Optional.ofNullable(array[index]);
    } catch (ArrayIndexOutOfBoundsException e) {
      return Optional.empty();
    }
  }
}
