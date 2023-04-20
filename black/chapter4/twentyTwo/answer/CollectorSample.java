package black.chapter4.twentyTwo.answer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CollectorSample {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("A", "B", "C", "D", "E");
    String result = list.stream().collect(new SampleCollectror());
    System.out.println(result);
  }
}
