public class TryWithoutCatch {
    public static void main(String[] args) {
        System.out.println("Program started");
        try{
            int a = 15/0;
        }finally {//no presence of catch block here
            System.out.println("This is the finally block"); //this executes even if there is a RuntimeException
        }
        System.out.println("Program ended"); //This will never be reached
    }
}
