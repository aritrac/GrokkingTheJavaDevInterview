import java.lang.reflect.Field;
import java.util.HashMap;

public class TestHashMap {
    //If the code is failing to run, then add VM Options in Intellij and then add the below line
    //--add-opens java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED
    public static void main(String[] args) throws Exception{
        HashMap<Employee, String> map = new HashMap<>();

        //DEFAULT_CAPACITY of HashMap is 16 and load factor is 75%, once it is more than that,
        //the capacity is doubled, so 12/16 = 75 %
        //once the hashmap size becomes 13, which is more than 75%, the size of the map is doubled
        //if you change the below loop condition from i < 13 to i <= 13, you will notice
        //the hashmap capacity being reported as 32 instead of default 16

        for(int i = 1; i < 13; i++){
            map.put(new Employee(i), "Hello " + i);
        }

        Field tableField = HashMap.class.getDeclaredField("table");
        tableField.setAccessible(true);

        Object[] table = (Object[]) tableField.get(map);
        System.out.println("hashmap capacity: ");
        System.out.println(table == null ? 0 : table.length);
        System.out.println("\nhashmap size:" + map.size());
    }
}
