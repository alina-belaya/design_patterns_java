import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StaffList implements Iterable<Employee> {
    private final List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
        Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName())); // Sort alphabetically
    }

    @Override
    public Iterator<Employee> iterator() {
        return new StaffListIterator(employees);
    }
}