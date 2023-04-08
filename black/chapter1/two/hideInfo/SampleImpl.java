package black.chapter1.two.hideInfo;

/**
 * クラスのアクセス修飾子をデフォルトに変更することで、
 * パッケージ外のクラスからはアクセスできなくなる。
 */
class SampleImpl implements Sample {
  public void test() {
    System.out.println("test");
  }

  @Override
  public void execute() {
    System.out.println("execute");
  }
}
