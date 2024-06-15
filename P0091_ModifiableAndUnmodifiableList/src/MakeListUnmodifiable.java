import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MakeListUnmodifiable {
    public static void main(String[] args) {
        //We cannot make a list final by just making the reference variable as final as shown
        final List<String> list = new ArrayList<>();

        //It looks like the above list is unmodifiable, but we can add to the list as below
        list.add("Aritra");
        list.add("Rimi");
        list.add("Ritu");

        //The only thing we wont be able to do is to re-reference the reference variable to a new list object
        //The statement below will not work as the list reference has been declared as final
        //list = new ArrayList<>();

        System.out.println(list);

        //We will use Collections.unmodifiableList to make a list readonly such as below
        List<String> newList1 = new ArrayList<>();
        newList1.add("Maa");
        newList1.add("Baba");
        //Now making the newList1 unmodifiable
        newList1 = Collections.unmodifiableList(list);

        //now if we try to add to the newList1, exception will be thrown
        //The below add operation will throw an exception, hence commenting it out
        // newList1.add("Uncle");
        System.out.println(newList1);

        //Now we will not use the same list reference to add to an unmodifiable list
        //We will create a new list reference from an unmodifiable list and then add to that as shown next
        List<String> demoList = new ArrayList<>();
        demoList.add("John");
        demoList.add("Mike");
        demoList.add("Lisa");

        List<String> unmodifiableList = Collections.unmodifiableList(demoList);

        //now unmodifiableList reference is unmodifiable, but we can still continue appending to the list
        //using the demoList reference
        demoList.add("Kanchan");
        demoList.add("Boisakhi");
        System.out.println(demoList);

    }
}
