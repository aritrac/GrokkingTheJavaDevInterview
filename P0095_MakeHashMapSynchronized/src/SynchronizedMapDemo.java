import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapDemo {
    public static void main(String[] args) throws InterruptedException {
        //This map is synchronized synchronized, hence there is no update guarantee
        Map<String, String> newMap = new HashMap<>();
        //Creating a synchronized map from new map
        Map<String, String> synchronizedMap = Collections.synchronizedMap(newMap);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    synchronizedMap.put("Key1","Aritra");
                    Thread.sleep(1000);
                    synchronizedMap.put("Key2","ariTRA");
                    Thread.sleep(1000);
                    synchronizedMap.put("Key3","aritra");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    synchronizedMap.put("Key1","Ritu");
                    Thread.sleep(1000);
                    synchronizedMap.put("Key2", "riTU");
                    Thread.sleep(1000);
                    synchronizedMap.put("Key3", "RItu");
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        t2.join();

        System.out.println(newMap);
    }
}
