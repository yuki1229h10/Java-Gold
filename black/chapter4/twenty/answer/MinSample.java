package black.chapter4.twenty.answer;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinSample {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    Optional<Integer> result = list.stream().min((a, b) -> {
      if (a == b)
        return 0;
      if (a < b)
        return -1;
      return 1;
    });
    result.ifPresent(System.out::println);
  }
}
