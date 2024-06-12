public class Tester {
    public static void main(String[] args) {
        ReentrantDemo rd = new ReentrantDemo();

        Thread thread1 = new Thread(new Task(rd));

        thread1.start();
    }
}
