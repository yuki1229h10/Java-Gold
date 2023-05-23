package black.chapter5.Q4.answer;

import java.io.BufferedReader;
import java.io.FileReader;

public class NewSample {
  public static void main(String[] args) throws Exception {
    FileReader fr = new FileReader("data.txt");
    BufferedReader reader = new BufferedReader(fr);
    try (reader) {
      reader.lines().forEach(System.out::println);
    }
  }
}
