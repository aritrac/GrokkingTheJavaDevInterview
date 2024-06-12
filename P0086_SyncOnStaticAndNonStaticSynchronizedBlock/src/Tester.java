public class Tester {
    public static void main(String[] args) {
        SyncAndStaticSyncDemo demo = new SyncAndStaticSyncDemo();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //acquires lock at the instance level which is different from the class lock
                demo.m2();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                //acquires lock at the class level which is different from instance locks
                SyncAndStaticSyncDemo.m1();
            }
        });
        //Both threads run concurrently and independently as locks are different
        //and they dont have to wait on each other for their respective locks
        thread1.start();
        thread2.start();
    }
}
