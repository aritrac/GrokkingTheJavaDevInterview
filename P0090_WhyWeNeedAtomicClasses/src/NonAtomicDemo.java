public class NonAtomicDemo {
    public static void main(String[] args) {
        Task task = new Task();

        //If you uncomment the lines below, the final value of count is not guaranteed to be 100
        //which will be evident from the output

        Thread t1 = new Thread(task);
        //Thread t2 = new Thread(task);

        t1.start();
        //t2.start();

        try {
            t1.join();
            //t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Count is : " + task.getCount());
    }
}
