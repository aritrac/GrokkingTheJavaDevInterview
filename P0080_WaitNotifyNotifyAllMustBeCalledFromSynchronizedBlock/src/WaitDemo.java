public class WaitDemo {
    public static void main(String[] args) {
        WaitDemo wd = new WaitDemo();

        try{
            wd.wait(); //Since this code is not synchronized, hence the monitor is not available for the wait method
            //to be called, same will be applicable for notify and notifyAll methods
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
