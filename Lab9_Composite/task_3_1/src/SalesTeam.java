import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Employee {

    private List<Employee> teamMembers;

    public SalesTeam() {
        this.teamMembers = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        teamMembers.add(emp);
    }

    public void payExpenses() {
        for (Employee emp : teamMembers) {
            emp.payExpenses();
        }
    }
}