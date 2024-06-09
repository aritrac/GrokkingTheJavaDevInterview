import java.util.ArrayList;
import java.util.List;

public class ExampleOne {
    public static void main(String[] args) {
        //Before generics
        List list = new ArrayList();
        list.add("Mike");
        list.add(10);

        // String name = list.get(0); This will throw a compile time error stating an object is being returned
        //when a String is required, hence in this case explicit type casting is required before assignment

        String name = (String)list.get(0); //Like this you need to typecast

        System.out.println("Non-generic name: " + name);

        //After generics
        List<String> list2 = new ArrayList<>();
        list2.add("Mike");

        String newName = list2.get(0); //In this case, no typecasting is required as we have specified the generic
            //type of the list to be String instead of the default Object
        System.out.println("Generic name: " + newName);
    }
}
