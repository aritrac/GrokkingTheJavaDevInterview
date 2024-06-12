public class Hello {
    static synchronized void sayHello(){
        System.out.println("in sayHello() method " +
                Thread.currentThread().getName());

        for(int i = 1; i <= 5; i++){
            System.out.println(Thread.currentThread().getName() + " , i = " + i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}
