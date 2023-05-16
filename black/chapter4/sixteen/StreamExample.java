package black.chapter4.sixteen;

import java.util.stream.Stream;

public class StreamExample {
  public static void main(String[] args) {
    Stream<String> stream = Stream.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
        "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");

    String randomElement = stream.findAny().orElse(null);
    System.out.println("Random Element: " + randomElement);
  }
}
