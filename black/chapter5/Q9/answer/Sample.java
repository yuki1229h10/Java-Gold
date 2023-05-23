package black.chapter5.Q9.answer;

import java.io.FileInputStream;
import java.util.Scanner;

public class Sample {
  public static void main(String[] args) throws Exception {
    FileInputStream fis = new FileInputStream("data.txt");
    Scanner scanner = new Scanner(fis);
    try (scanner) {
      while (scanner.hasNext()) {
        System.out.println(scanner.next());
      }
    }
  }
}
