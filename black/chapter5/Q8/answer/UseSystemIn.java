package black.chapter5.Q8.answer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UseSystemIn {
  public static void main(String[] args) throws Exception {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      String input = br.readLine();
      System.out.println(input);
    }
  }
}
