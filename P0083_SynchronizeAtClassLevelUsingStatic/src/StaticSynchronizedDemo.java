public class StaticSynchronizedDemo {
    public static void main(String[] args) {
        //Using static synchronized method
        Thread task1 = new Thread(new Task());
        Thread task2 = new Thread(new Task());
        Thread task3 = new Thread(new Task());
        Thread task4 = new Thread(new Task());

        task1.start();
        task2.start();
        task3.start();
        task4.start();

        //using static method with a static synchronized block within itself
        Thread task5 = new Thread(new TaskVariation2());
        Thread task6 = new Thread(new TaskVariation2());
        Thread task7 = new Thread(new TaskVariation2());
        Thread task8 = new Thread(new TaskVariation2());

        task5.start();
        task6.start();
        task7.start();
        task8.start();
    }
}
