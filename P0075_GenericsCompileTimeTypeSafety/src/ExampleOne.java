import java.util.ArrayList;
import java.util.List;

public class ExampleOne {
    public static void main(String[] args) {
        //Before generics
        List list = new ArrayList();
        list.add("Mike"); //Can add a string
        list.add(10); //Can add a number
        //No consistency of data type, any data type can be added
        System.out.println("Before generics: " + list);

        //After generics
        List<String> list2 = new ArrayList<>();
        list2.add("MikeNew"); //Since the list is of type String, we can add string without issue
        // list2.add(10);  This line will show compile time error expecting a String to be passed,
        //when actually a number is being passed
        System.out.println("After generics: " + list2);
    }
}
