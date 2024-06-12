public class Test {
    public static void main(String[] args) {
        //Since the static methods are synchronized, the class level lock which is only one,
        //will be assigned to one thread at a time, hence until thread1 is complete,
        //thread2 will not get the lock and has to wait, hence there will be no deadlock

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                StaticSynchronizedDemo.m1();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                StaticSynchronizedDemo.m2();
            }
        });

        t1.start();
        t2.start();
    }
}
