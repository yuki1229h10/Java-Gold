package practice.chapter1.section3.two.substitute;

import java.util.function.*;

public class Main {
  public static Integer len(String s) {
    return s.length();
  }

  public static void main(String[] args) {
    Function<String, Integer> func = Main::len;
    int a = func.apply("Java");
    System.out.println("文字列「Java」は" + a + "文字です");

    /** 引数は受け取るけど消費するだけ */
    Consumer<String> func1 = System.out::println;
    func1.accept("Hello, world");

    /** 改行 getとは提供される情報を得るから */
    Supplier<String> func2 = System::lineSeparator;
    System.out.println("改行します" + func2.get());

    /** 複数の引数を受け取る関数を格納する */
    BiFunction<String, String, String> func3 = System::getProperty;
    System.out.println(func3.apply("Java.version", "不明"));
  }
}
