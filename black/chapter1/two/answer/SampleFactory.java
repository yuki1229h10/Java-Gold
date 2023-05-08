package black.chapter1.two.answer;

public class SampleFactory {
  public static Sample create() {
    return new SampleFactory().new SampleImpl();

    /**
     * 上記のreturn文を分解したのがこれ。
     */
    // SampleFactory factory = new SampleFactory();
    // Sample sample = factory.new SampleImpl();
    // return sample;
  }

  private class SampleImpl implements Sample {
    public void test() {
      System.out.println("test");
    }

    @Override
    public void execute() {
      System.out.println("execute");
    }
  }
}
