public class Employee implements Cloneable{
    private String name;
    private int age;
    private Company company;

    public Employee(String name, int age, Company company){
        this.name = name;
        this.age = age;
        this.company = company;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public Company getCompany(){
        return company;
    }

    public void setCompany(Company company){
        this.company = company;
    }

    //For deep copy, we need to make sure that Company object also calls its own clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee employee = (Employee)super.clone();
        employee.setCompany((Company) company.clone());
        return employee;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Company c1 = new Company("Company_ABC");
        Employee e1 = new Employee("Mike", 10, c1);
        System.out.println("Employee 1, company name : " + e1.getCompany().getName());

        Employee e2 = (Employee) e1.clone();
        System.out.println("Employee 2, company name : " + e2.getCompany().getName());
        e2.getCompany().setName("XYZ");

        System.out.println("___________________");
        System.out.println("Employee 1, company name : " + e1.getCompany().getName());
        System.out.println("Employee 2, company name : " + e2.getCompany().getName());
    }
}

class Company implements Cloneable{
    private String name;
    public Company(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


    //This will implement deep copy, so in the parent class, when we are cloning a parent object
    //a new reference to Company will be created and assigned
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
