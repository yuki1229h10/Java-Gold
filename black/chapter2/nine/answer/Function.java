package black.chapter2.nine.answer;

@FunctionalInterface
public interface Function<T, R> {
  R apply(T t);
}
