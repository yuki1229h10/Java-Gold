package black.chapter3.Q14.answer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BankSample2 {
  public static void main(String[] args) throws Exception {
    BankAccount a = new BankAccount(100);
    BankAccount b = new BankAccount(100);

    ExecutorService exec = Executors.newFixedThreadPool(2);
    exec.submit(() -> {
      synchronized (a) {
        a.withdrawals(20);
        synchronized (b) {
          b.deposit(20);
        }
      }
    });

    exec.submit(() -> {
      synchronized (a) {
        a.deposit(30);
        synchronized (b) {
          b.withdrawals(30);
        }
      }
    });
  }
}
