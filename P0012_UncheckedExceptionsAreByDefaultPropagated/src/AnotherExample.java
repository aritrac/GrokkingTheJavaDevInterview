public class AnotherExample {
    public static void method1(){
        int a = 10/0; //Unchecked arithmeticexception gets thrown by default, does not need throws
    }

    public static void main(String[] args) {
        try{
            method1();
        }catch(ArithmeticException ex){
            System.out.println("Exception handled");
        }
    }
}
