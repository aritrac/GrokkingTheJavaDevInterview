import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTask implements Runnable{
    private AtomicInteger count = new AtomicInteger();

    public int getCount(){
        return this.count.get();
    }

    @Override
    public void run() {
        for(int i = 1; i <= 50; i++){
            try {
                Thread.sleep(500);
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
            count.incrementAndGet();
        }
    }
}
