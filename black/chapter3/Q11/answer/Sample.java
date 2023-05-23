package black.chapter3.Q11.answer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sample {
  public static void main(String[] args) throws InterruptedException {
    ExecutorService exec = Executors.newSingleThreadExecutor();
    List<Future<Boolean>> futures = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      futures.add(exec.submit(() -> {
        if (new Random().nextInt() % 2 != 0) {
          throw new Exception("Old Number");
        }
        return true;
      }));
    }

    int total = 0;
    for (Future<Boolean> future : futures) {
      Boolean result = false;
      try {
        result = future.get();
        System.out.println(result);
      } catch (ExecutionException e) {
        System.out.println(e.getMessage());
      }
      if (result) {
        total++;
      }
    }
    System.out.println(total);
  }
}
