package black.chapter4.eighteen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    Stream<String> result = list.stream().map(n -> String.valueOf(n));
  }
}
