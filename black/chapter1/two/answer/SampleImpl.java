package black.chapter1.two.answer;

class SampleImpl implements Sample {
  public void test() {
    System.out.println("test");
  }

  @Override
  public void execute() {
    System.out.println("execute");
  }
}
