import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Task2 implements Runnable{
    String name;
    List<Integer> numbers;
    CyclicBarrier barrier;

    public Task2(String name, List<Integer> numbers, CyclicBarrier barrier){
        this.name = name;
        this.numbers = numbers;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        System.out.println(name + " is running");

        for(int i = 6; i <= 10; i++){
            numbers.add(i);
        }

        try{
            barrier.await();
        }catch(InterruptedException | BrokenBarrierException e){
            e.printStackTrace();
        }

        System.out.println(name + " has crossed the barrier");
    }
}
