import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIteratorITest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("List: " + list);
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            itr.remove(); //This also modifies the underlying collection, but the ConcurrentModificationException
            //is not thrown in this case
        }
        System.out.println("List: " + list);
    }
}
