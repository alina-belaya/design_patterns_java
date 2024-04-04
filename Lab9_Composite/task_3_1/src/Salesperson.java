public class Salesperson implements Employee {

  private String name;
  private int salary;

  public Salesperson(String name, int salary) {
    this.name = name;
    this.salary = salary;
  }

  public void payExpenses() {
    System.out.println(name + " has been paid $" + salary);
  }
}