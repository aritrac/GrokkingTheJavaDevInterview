public final class Employee {
    private final String name;
    private final int age;
    private final Address address;

    public Employee(String name, int age, Address address){
        this.name = name;
        this.age = age;
        //When setting a mutable member, perform a copy of the actual object and then assign
        Address cloneAddress  = new Address(address.getCity(), address.getState());
        this.address = cloneAddress;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        //Also when return the mutable reference, create a new object using deep copy and then return
        return new Address(address.getCity(), address.getState());
    }

    @Override
    public String toString(){
        return "Employee [name=" + name + ", age=" + age + ", address=" + address + "]";
    }
}
