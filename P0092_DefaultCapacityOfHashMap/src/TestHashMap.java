import java.lang.reflect.Field;
import java.util.HashMap;

public class TestHashMap {
    //If the code is failing to run, then add VM Options in Intellij and then add the below line
    //--add-opens java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED
    public static void main(String[] args) throws Exception{
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Mike");

        //Using reflection API to get details about the HashMap class
        Field tableField = HashMap.class.getDeclaredField("table");
        tableField.setAccessible(true);

        Object[] table = (Object[])tableField.get(map);
        System.out.println("hashmap capacity : ");
        System.out.println(table == null ? 0 : table.length);
        System.out.println("\nhashmap size: " + map.size());
    }
}
