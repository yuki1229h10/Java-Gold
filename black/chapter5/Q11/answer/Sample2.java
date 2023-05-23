package black.chapter5.Q11.answer;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Sample2 {
  public static void main(String[] args) throws Exception {
    ObjectInputStream in = new ObjectInputStream(
        new FileInputStream("emp.ser"));

    try (in) {
      Employee emp = (Employee) in.readObject();
      System.out.println(emp);
    }
  }
}
