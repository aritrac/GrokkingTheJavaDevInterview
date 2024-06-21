import java.util.*;

public class IteratorAndListIterator {
    public static void main(String[] args) {
        /**
         * Iterators can traverse the collection only in one direction, i.e forward direction but
         * ListIterator can traverse the list in both directions, forward as well as backward,
         * using previous() and next() method
         *
         * Iterator cannot add element to a collection while iterating over it, but ListIterator can add
         * elements while iterating over the list
         *
         * Iterator cannot modify an element while iterating over a collection, but ListIterator has set(E e)
         * method which can be used to modify the element
         *
         * Iterator can be used with List, Set or Map but ListIterator only works with Lists
         *
         * Iterator has no method to obtain an index of the collection elements but ListIterator has methods like
         * previousIndex() and nextIndex() which can be used to obtain the index
         */

        List<Integer> numberList = new ArrayList<>();
        Iterator<Integer> numListIter = numberList.iterator(); //This is the normal iterator

        //numListIter has the following methods
        numListIter.hasNext();
        numListIter.next();

        //There are no methods to go back or get the current index

        ListIterator<Integer> listIterator = numberList.listIterator(); //This is the list iterator

        //listIterator has the following methods
        listIterator.hasNext();
        listIterator.hasPrevious(); //missing in iterators
        listIterator.add(12); //missing in iterators
        listIterator.nextIndex(); //missing in iterators
        listIterator.previousIndex(); //missing in iterators
        listIterator.previous(); //missing in iterators
        listIterator.next();

        Map<Integer, String> newMap = new TreeMap<>();
        //Maps does not have listIterator, only lists have them
        Iterator<Integer> mapIter = newMap.keySet().iterator();
    }
}
