public class Task implements Runnable{

    @Override
    public void run() {
        Hello.sayHello(); //invoke the synchronized static method
    }
}
