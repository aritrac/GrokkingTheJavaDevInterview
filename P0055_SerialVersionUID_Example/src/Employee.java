import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }
}
