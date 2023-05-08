package black.chapter1.eight;

public class Main {
  public static void main(String[] args) {
    Sample sample = new Sample() {
      public Sample() {
        System.out.println("B");
      }
    };
  }
}
