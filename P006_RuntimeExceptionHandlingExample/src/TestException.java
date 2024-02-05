public class TestException {
    public static void main(String[] args) {
        System.out.println("Program started");
        int a = 15/0; //Since this will throw an exception, the next line will never be reached
        System.out.println("Program ended");
    }
}
