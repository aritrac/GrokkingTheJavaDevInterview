import java.util.concurrent.CountDownLatch;

public class Task implements Runnable{
    String service;
    CountDownLatch latch;

    public Task(String service, CountDownLatch latch){
        this.service = service;
        this.latch = latch;
    }
    @Override
    public void run() {
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(service + " is up");
        latch.countDown();
    }
}
