package practice.chapter2.section6.four.tryWithResourcesWrite;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    try (
        FileWriter fw = new FileWriter("test.dat", true);) {
      fw.write('A');
      fw.flush();
    } catch (IOException e) {
      System.out.println("ファイル書き込みエラーです");
    }
  }
}
