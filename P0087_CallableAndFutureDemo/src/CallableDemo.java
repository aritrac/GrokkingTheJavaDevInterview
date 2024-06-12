import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args) {
        Task task = new Task(5); //if we pass negative number, then exception will be thrown

        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Integer> f = es.submit(task);

        try{
            System.out.println("Result: " + f.get());
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
        es.shutdown();
    }
}
