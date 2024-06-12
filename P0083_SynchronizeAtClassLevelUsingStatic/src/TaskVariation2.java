public class TaskVariation2 implements Runnable{

    @Override
    public void run() {
        HelloVariation2.sayHello(); //invoke the synchronized static method
    }
}
