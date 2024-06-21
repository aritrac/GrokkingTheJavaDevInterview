import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIteratorTest {
    /*
    Fail safe iterators does not throw ConcurrentModificationException, because they operate on the clone of
    the collection, not the actual collection. This also means that any modification done on the actual collection goes
    unnoticed by these iterators. The last statement is not always true though. Sometimes it can happen
    that the iterator may reflect modifications to the collection after the iterator is created, but there is
    no guarantee of it. CopyOnWriteArrayList and ConcurrentHashMap are examples of fail-safe iterators
     */
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>(); //Fail-safe iterator
        map.put(1, "Mike");
        map.put(2, "John");
        map.put(3, "Lisa");

        Iterator<Integer> itr = map.keySet().stream().iterator();

        while(itr.hasNext()){
            Integer key = itr.next();
            System.out.println(key + " : " + map.get(key));
            map.put(4,"Ryan"); //Here we are modifying the collection, but the exception will not be thrown
        }

        System.out.println("Map: " + map);
    }
}
