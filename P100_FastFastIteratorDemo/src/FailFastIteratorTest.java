import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIteratorTest {
    /*
    All the collections maintain internally some sort of array to store the elements,
    fail-fast iterators fetch the elements from this array. Whenever we modify the collection
    an internal field called modCount is updated. This modCount is used by fail-safe iterators
    to know whether the collection is structurally modified or not. Everytime when the iterator's next() method
    is called, it checks the modCount. If it finds the modCount has been updated after the Iterator has been created,
    it throws ConcurrentModificationException
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            list.add(4); //This will update the modCount and ConcurrentModificationException will be thrown
        }

    }
}
