import java.util.Iterator;
import java.util.List;

public class StaffListIterator implements Iterator<Employee> {
    private final List<Employee> sortedEmployees;
    private int index = 0;

    public StaffListIterator(List<Employee> employees) {
        this.sortedEmployees = employees; // Assumes list is already sorted
    }

    @Override
    public boolean hasNext() {
        return index < sortedEmployees.size();
    }

    @Override
    public Employee next() {
        return sortedEmployees.get(index++);
    }
}