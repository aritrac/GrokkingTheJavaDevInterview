import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        //Here the map key is a custom class, and to maintain natural order based on the key
        //we need the custom class to implement the Comparable interface,
        //which is not required in case of Wrapper class which already has that
        TreeMap<Employee, Integer> map = new TreeMap<>();

        //Even though the insertion below is not as per alphabetical order,
        //the entries are printed in alphabetical order

        map.put(new Employee("Mike", 20), 100);
        map.put(new Employee("John", 10), 500);
        map.put(new Employee("Ryan", 15), 200);
        map.put(new Employee("Lisa", 20), 400);

        map.forEach((k,v) -> System.out.println(k + ":" + v));
    }

}
