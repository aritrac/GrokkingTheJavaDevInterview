import java.security.InvalidParameterException;
import java.util.concurrent.Callable;

public class Task implements Callable<Integer> {
    private int num;

    public Task(int num){
        this.num = num;
    }
    @Override
    public Integer call() throws Exception {
        if(num < 0){
            throw new InvalidParameterException("Negative number is not allowed");
        }
        return num*num;
    }
}
