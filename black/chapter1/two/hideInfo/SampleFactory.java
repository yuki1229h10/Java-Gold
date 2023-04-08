package black.chapter1.two.hideInfo;

/**
 * 実際に動作するSampleImplクラスを隠蔽しつつ、
 * 公開可能な最低限の機能だけを提供するSampleを利用することが出来る。
 */
public class SampleFactory {
  public static Sample create() {
    return new SampleFactory().new SampleImpl();
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
