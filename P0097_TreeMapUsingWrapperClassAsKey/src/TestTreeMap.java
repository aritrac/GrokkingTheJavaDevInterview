import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        /*
        Since TreeMap sorts the entries using natural ordering, the key class should implement
        Comparable interface
        In the example below, since the key class is an Integer which already implements Comparable,
        so the entries are naturally ordered
         */
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(4,"Aritra");
        map.put(1,"Rimi");
        map.put(3,"Riyansika");
        map.put(2,"Ritu");

        map.forEach((k,v) -> System.out.println(k + ":" + v));
    }
}
