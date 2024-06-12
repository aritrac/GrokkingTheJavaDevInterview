import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Task1 implements Runnable{
    String name;
    List<Integer> numbers;
    CyclicBarrier barrier;

    public Task1(String name, List<Integer> numbers, CyclicBarrier barrier){
        this.name = name;
        this.numbers = numbers;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        System.out.println(name + " is running");

        for(int i = 1; i <= 5; i++){
            numbers.add(i);
        }

        try{
            barrier.await(); //This will decrease the barrier count by 1 and it will start the next thread
            //which has been passed the same barrier. When the barrier count reaches 0, barrier action
            //will be executed which is the Final Task, and then the threads will terminate by printing
            //the message ' name has crossed the barrier'
        }catch(InterruptedException | BrokenBarrierException e){
            e.printStackTrace();
        }
        System.out.println(name + " has crossed the barrier");
    }
}
