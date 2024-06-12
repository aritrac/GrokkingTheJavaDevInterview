public class SyncAndStaticSyncDemo {
    public static synchronized void m1(){
        System.out.println("inside m1()");
        for(int i = 1;i<=5;i++){
            System.out.println(Thread.currentThread().getName() + " , i = " + i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }

    public synchronized void m2(){
        System.out.println("inside m2()");
        for(int i = 1; i <=5; i++){
            System.out.println(Thread.currentThread().getName() + " , i = " + i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}
