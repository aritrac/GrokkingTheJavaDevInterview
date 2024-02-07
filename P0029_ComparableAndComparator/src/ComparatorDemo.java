import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(4, "Dave", 25, 28000));
        empList.add(new Employee(20, "Mike", 20, 10000));
        empList.add(new Employee(9, "Abhi", 32, 5000));
        empList.add(new Employee(1, "Lisa", 40, 19000));

        Collections.sort(empList, new NameComparator());
        System.out.println(empList);

        Collections.sort(empList, new SararyComparator());
        System.out.println(empList);
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2){
        return emp1.getName().compareTo(emp2.getName());
    }
}

class SararyComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2){
        return (int)(emp1.getSalary() - emp2.getSalary());
    }
}
