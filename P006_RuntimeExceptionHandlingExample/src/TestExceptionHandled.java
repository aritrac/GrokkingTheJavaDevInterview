public class TestExceptionHandled {
    public static void main(String[] args) {
        System.out.println("Program started");
        try{
            int a = 15/0;
        }catch(ArithmeticException ex){ //Since the exception is now handled, this will not abruptly stop the program
                                        //and its normal flow will continue
            System.out.println("Exception handled");
        }
        System.out.println("Program ended");
    }
}
