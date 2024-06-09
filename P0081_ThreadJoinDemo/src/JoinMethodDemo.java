public class JoinMethodDemo {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(new JoinTask());
        t1.setName("Thread 1");
        Thread t2 = new Thread(new JoinTask());
        t2.setName("Thread 2");
        Thread t3 = new Thread(new JoinTask());
        t3.setName("Thread 3");

        t1.start();
        System.out.println("Current thread : " + Thread.currentThread().getName());
        t1.join(); //Now main thread will wait for t1 to complete before proceeding

        t2.start();
        System.out.println("Current thread : " + Thread.currentThread().getName());
        t2.join(); //Now main thread will wait for t2 to complete before proceeding

        t3.start();
        System.out.println("Current thread : " + Thread.currentThread().getName());
        t3.join(); //Now main thread will wait for t3 to complete before proceeding

        //If the above line is commented, then main thread will not wait for t3 thread completion
        //and will exit prematurely

        System.out.println("Exiting from main thread : " + Thread.currentThread().getName());
    }
}
