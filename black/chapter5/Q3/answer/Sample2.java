package black.chapter5.Q3.answer;

import java.io.FileReader;

public class Sample2 {
  public static void main(String[] args) throws Exception {
    FileReader reader = new FileReader("data.txt");
    try (reader) {
      int i = 0;
      while ((i = reader.read()) != -1) {
        char c = (char) i;
        System.out.print(c);
      }
    }
  }
}
