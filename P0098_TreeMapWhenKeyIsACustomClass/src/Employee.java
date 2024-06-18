public class Employee implements Comparable<Employee>{
    String name;
    int age;

    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + "]";
    }
}
