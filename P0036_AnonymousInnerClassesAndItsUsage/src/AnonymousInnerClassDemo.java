import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(4, "Dave", 25, 28000));
        empList.add(new Employee(20, "Mike", 20, 10000));
        empList.add(new Employee(9, "Abhi", 32, 5000));
        empList.add(new Employee(1, "Lisa", 40, 19000));
        empList.add(new Employee(15, "Mike", 25, 15000));
        empList.add(new Employee(8, "Mike", 30, 20000));

        Collections.sort(empList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(empList);
    }
}
