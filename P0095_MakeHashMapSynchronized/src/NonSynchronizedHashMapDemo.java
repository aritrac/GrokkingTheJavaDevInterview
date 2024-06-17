import java.util.HashMap;
import java.util.Map;

public class NonSynchronizedHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        //This map is not synchronized, hence there is no update guarantee
        Map<String, String> newMap = new HashMap<>();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    newMap.put("Key1","Aritra");
                    Thread.sleep(1000);
                    newMap.put("Key2","ariTRA");
                    Thread.sleep(1000);
                    newMap.put("Key3","aritra");
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
                    newMap.put("Key1","Ritu");
                    Thread.sleep(1000);
                    newMap.put("Key2", "riTU");
                    Thread.sleep(1000);
                    newMap.put("Key3", "RItu");
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
