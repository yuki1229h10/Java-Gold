package black.chapter4.three.orElse;

import java.util.Optional;

import javax.swing.plaf.OptionPaneUI;

public class GetTest2 {
  public static void main(String[] args) {
    Optional<String> sample = Optional.empty();
    System.out.println(sample.orElseGet(() -> "else"));
  }
}
