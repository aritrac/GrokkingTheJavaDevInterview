import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);

        Thread t1 = new Thread(new Task("Service1", latch));
        Thread t2 = new Thread(new Task("Service2", latch));
        Thread t3 = new Thread(new Task("Service3", latch));

        t1.start();
        t2.start();
        t3.start();

        try{
            latch.await();
            System.out.println("All services are up, Starting main application now");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
