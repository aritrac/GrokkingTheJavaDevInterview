public class JoinTask implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " is complete");
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
