import java.util.List;

public class FinalTask implements Runnable{
    String name;
    List<Integer> numbers;

    public FinalTask(String name, List<Integer> numbers){
        this.name = name;
        this.numbers = numbers;
    }
    @Override
    public void run() {
        int sum = 0;
        for(Integer i : numbers) {
            sum = sum + i;
        }
        System.out.println("Sum of first 10 natural numbers : " + sum);
    }
}
