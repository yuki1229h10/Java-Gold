package black.chapter9.four.answer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class FileCopy {
  public static void main(String[] args) {
    BufferedReader in = null;
    BufferedWriter out = null;
    try {
      in = new BufferedReader(new FileReader(new File("input.txt")));
    }
  }
}
