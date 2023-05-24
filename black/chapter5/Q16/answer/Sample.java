package black.chapter5.Q16.answer;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Sample {
  public static void main(String[] args) {
    Path sample = Paths.get("data.txt");
    try (BufferedWriter out = Files.newBufferedWriter(sample, StandardOpenOption.APPEND)) {
      out.write("hello");
      out.newLine();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
