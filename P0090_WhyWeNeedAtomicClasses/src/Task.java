public class Task implements Runnable{
    private int count; //Any thread is free to update this value as there is no synchronization

    public int getCount(){
        return this.count;
    }
    @Override
    public void run() {
        for(int i = 1; i <= 50; i++){
            try {
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            count++;
        }
    }
}
