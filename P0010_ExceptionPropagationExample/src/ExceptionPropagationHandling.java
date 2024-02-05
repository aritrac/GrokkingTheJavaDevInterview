public class ExceptionPropagationHandling {
    public static void main(String[] args) {
        try{
            method1();
        }catch(ArithmeticException ex){
            System.out.println("The exception has been handled");
        }
    }

    public static void method1(){
        method2();
    }

    public static void method2(){
        throw new ArithmeticException("ArithmeticException is being thrown from method2");
    }
}
