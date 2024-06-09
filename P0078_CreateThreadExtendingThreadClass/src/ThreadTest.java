public class ThreadTest {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            Task task = new Task();
            task.setName("Thread " + i);
            task.start();
        }
    }
}
