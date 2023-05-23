package black.chapter5.Q3.answer;

import java.io.FileReader;

public class Sample {
  public static void main(String[] args) throws Exception {
    FileReader reader = null;
    try {
      reader = new FileReader("data.txt");
      int i = 0;

      while ((i = reader.read()) != -1) {
        char c = (char) i;
        System.out.print(c);
      }
    } finally {
      if (reader != null) {
        reader.close();
      }
    }
  }
}
