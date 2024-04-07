import java.io.*;

/*
Externalizable interface is uded when we want to implement custom logic to serialize/deserialize an object.
Externalizable interface extends the Serializable interface, and it has two methods, writeExternal() and
readExternal() which are used for serialization and de-serialization. This way, we can change the JVM's
default serialization behaviour because while using Externalizable, we decide what to store in the stream.
 */
public class TestExternalizable {
    public static void main(String[] args) {
        Employee emp = new Employee("Mike", 15, 25000, "ABC");
        String file = "child4.ser";
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);

            fos.close();
            oos.close();
            System.out.println("Employee object is serialized : \n" + emp);

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee emp2 = (Employee) ois.readObject();
            System.out.println("Employee object is deserialized : \n" + emp2);
        }catch(IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

class Employee implements Externalizable {
    private String name;
    private int age;
    private transient int salary;
    private String companyName;
    /*
    The no-age constructor is necessary during deserialization,
    if we comment it out, our de-serialization will fail
     */
    public Employee(){
        System.out.println("No-arg constructor of Employee class");
    }
    public Employee(String name, int age, int salary, String companyName){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.companyName = companyName;
    }

    @Override
    public String toString(){
        return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", companyName=" + companyName + "]";
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(salary);
        out.writeInt(age);
        //we are omitting the companyName while serializing
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String)in.readObject();
        age = in.readInt();
        salary = in.readInt();
        //while reading companyName will be null
    }
}
