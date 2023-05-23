package black.chapter3.Q17;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
  private static ReentrantLock lock = new ReentrantLock();

  public static void main(String[] args) {
    Thread thread1 = new Thread(() -> {
      lock.lock();
      try {
        System.out.println("Thread 1 acquired the lock.");
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      } finally {
        lock.unlock();
        System.out.println("Thread 1 released the lock.");
      }
    });

    Thread thread2 = new Thread(() -> {
      lock.lock();
      try {
        System.out.println("Thread 2 acquired the lock.");
      } finally {
        lock.unlock();
        System.out.println("Thread 2 released the lock.");
      }
    });

    thread1.start();
    thread2.start();
  }
}
