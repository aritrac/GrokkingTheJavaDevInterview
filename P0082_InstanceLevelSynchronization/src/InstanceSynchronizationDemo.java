public class InstanceSynchronizationDemo {
    public static void main(String[] args) {
        Hello obj1 = new Hello();
        Hello obj2 = new Hello();

        Thread task1 = new Thread(new Task(obj1)); //Thread task1 and task2 are synchronized on the same instance obj1
        task1.setName("First Thread");

        Thread task2 = new Thread(new Task(obj1));
        task2.setName("Second Thread");

        Thread task3 = new Thread(new Task(obj2)); //Thread task3 and task4 are synchronized on the same instance obj2
        task3.setName("Third Thread");

        Thread task4 = new Thread(new Task(obj2));
        task4.setName("Fourth Thread");

        task1.start();
        task2.start();
        task3.start();
        task4.start();
    }
}
