import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //Autoboxing: int to Integer
        list.add(5);
        list.add(10);

        //Unboxing: Integer to int
        int a = list.get(0);

        System.out.println(a);
    }
}