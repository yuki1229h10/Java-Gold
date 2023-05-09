package black.chapter2.twelve.answer;

import java.util.function.UnaryOperator;

public class Sample {
  public static void main(String[] args) {
    UnaryOperator<Integer> increment = x -> ++x;
    System.out.println(increment.apply(10));

    UnaryOperator<Integer> twice = x -> x * 2;
    System.out.println(twice.apply(10));
  }
}
