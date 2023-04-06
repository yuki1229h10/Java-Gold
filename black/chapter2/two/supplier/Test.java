package black.chapter2.two.supplier;

import java.util.function.Supplier;

// public class Test {
//   public void execute() {
//     System.out.println("お決まりの事前処理");
//     A a = Factory.create();
//     a.hello();
//     System.out.println("お決まりの事後処理");
//   }
// }

public class Test {
  public void execute(Supplier<A> supplier) {
    System.out.println("お決まりの事前処理");
    A a = supplier.get();
    a.hello();
    System.out.println("お決まりの事後処理");
  }
}
