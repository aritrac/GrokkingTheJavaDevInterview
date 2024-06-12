public class AtomicDemo {
    public static void main(String[] args) {
        AtomicTask task = new AtomicTask();

        //Now the count is synchronized, and will reflect the true value of 100 and
        //only one thread is able to update the value at a time

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Count is : " + task.getCount());
    }
}
