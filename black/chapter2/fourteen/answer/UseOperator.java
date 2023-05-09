package black.chapter2.fourteen.answer;

import java.util.function.BinaryOperator;

public class UseOperator {
  public static void main(String[] args) {
    BinaryOperator<Integer> op = OperatorFactory.add();
    System.out.println(op.apply(10, 20));
  }
}
