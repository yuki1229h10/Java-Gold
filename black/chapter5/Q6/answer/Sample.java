package black.chapter5.Q6.answer;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Sample {
  public static void main(String[] args) throws Exception {
    FileWriter out = new FileWriter("data.txt", true);
    BufferedWriter writer = new BufferedWriter(out);
    try (writer) {
      writer.newLine();
      writer.write("buffering output");
      writer.flush();
    }
  }
}
