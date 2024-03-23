import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private int age;
    private transient int salary; //Since this field is transient, it won't be serialized, and in the serialized object
    //it will have default value of its datatype such as int=0, Objects=null

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
