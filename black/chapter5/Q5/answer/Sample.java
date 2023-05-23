package black.chapter5.Q5.answer;

import java.io.FileWriter;

public class Sample {
  public static void main(String[] args) throws Exception {
    FileWriter out = new FileWriter("data.txt", true);
    try (out) {
      out.write("¥n");
      out.write("OK");
    }
  }
}
