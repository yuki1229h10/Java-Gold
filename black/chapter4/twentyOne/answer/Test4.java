package black.chapter4.twentyOne.answer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("A", "B", "C", "D", "E");
    List<String> resultList = list.stream().collect(Collectors.toList());
    System.out.println(resultList.size());
  }
}
