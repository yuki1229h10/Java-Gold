package black.chapter2.eleven.answer;

@FunctionalInterface
public interface BiFunction<T, U, R> {
  R apply(T t, U u);
}
