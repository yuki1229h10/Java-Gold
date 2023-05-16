package black.chapter4.Q24;

public class Employee {
  private String name;
  private Department dept;

  public Employee(String name, Department dept) {
    this.name = name;
    this.dept = dept;
  }

  public String getName() {
    return name;
  }

  public Department getDept() {
    return dept;
  }

  @Override
  public String toString() {
    return "Employee [name=" + name + ", dept=" + dept.getName() + "]";
  }
}
