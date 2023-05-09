package black.chapter2.ten.answer;

import java.util.function.Function;

public class Main {
  public static void main(String[] args) {
    Function<Integer, Integer> plus = (x) -> x + 2;
    Function<Integer, Integer> times = (x) -> x * 2;

    System.out.println(plus.andThen(times).apply(5));
    System.out.println(times.andThen(plus).apply(5));
  }
}
