import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

    private String name;
    private int salary;
    private List<Employee> subordinates;

    public Manager(String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinate(Employee emp) {
        subordinates.add(emp);
    }

    public void payExpenses() {
        System.out.println(name + " has been paid $" + salary);
        for (Employee e : subordinates) {
            e.payExpenses();
        }
    }
}