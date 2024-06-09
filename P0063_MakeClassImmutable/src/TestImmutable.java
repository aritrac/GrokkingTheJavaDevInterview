public class TestImmutable {
    public static void main(String[] args) {
        Address address = new Address("Chennai", "Tamil Nadu");
        Employee employee = new Employee("Mike", 15, address);

        //External update of Address, does not affect internal state
        System.out.println("Original Employee object : \n" + employee);
        address.setCity("Mumbai");
        address.setState("Maharashtra");
        System.out.println("Employee object after local variable address change : \n" + employee);

        //External update of cloned address, does not affect internal state
        Address empAddress = employee.getAddress();
        empAddress.setCity("Jaipur");
        empAddress.setState("Rajasthan");
        System.out.println("Employee object after employee address change:\n" + employee);
    }
}
