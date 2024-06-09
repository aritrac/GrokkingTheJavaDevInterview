public class Task implements Runnable{
    Hello h;
    @Override
    public void run() {
        h.sayHello();
    }

    Task(Hello h){
        this.h = h;
    }
}
