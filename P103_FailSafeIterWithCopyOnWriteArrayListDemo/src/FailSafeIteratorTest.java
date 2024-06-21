import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIteratorTest {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>(); //provided fail safe iterator
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            list.add(4); //concurrent modification is allowed
        }
        System.out.println("List: " + list);
    }
}
