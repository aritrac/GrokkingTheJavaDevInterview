public class UncheckedExDefaultPropagation {
    public static void main(String[] args) {
        try{
            method1();
        }catch(ArithmeticException ex){
            System.out.println("Exception handled");
        }
    }

    public static void method1() throws ArithmeticException {
        int a = 10/0; //even though throws is declared, it is optional as by default the arithmetic exception will be thrown
    }
}
