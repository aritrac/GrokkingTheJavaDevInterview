public class Employee {
    //When custom class does not implement both equals and hashCode method
    //For this scenario, comment out the equals method below
    private String name;
    private int age;

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
    //when custom class implements equals method, but not hashcode
    //For this scenario, uncomment the below method
    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Employee other = (Employee)obj;
        if(age != other.age)
            return false;
        if(name == null){
            if(other.name != null)
                return false;
        }else if(!name.equals(other.name))
            return false;
        return true;
    }

    //when only hashcode is implemented, and not the equals method
    //for this scenario, uncomment the below method
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    //when both hashcode and equals method both are implemented
    //for this scenario, uncomment both the custom equals and hashcode methods
}
