public class Task implements Runnable{
    ReentrantDemo demo;
    Task(ReentrantDemo rd){
       this.demo = rd;
    }
    @Override
    public void run() {
        demo.m1();
    }
}
