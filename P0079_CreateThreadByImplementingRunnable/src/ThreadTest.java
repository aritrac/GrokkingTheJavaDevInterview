public class ThreadTest {
    public static void main(String[] args) {
        for(int i = 0; i<=5; i++){
            Thread task = new Thread(new Task());
            task.setName("Thread " + i);
            task.start();
        }
    }
}
