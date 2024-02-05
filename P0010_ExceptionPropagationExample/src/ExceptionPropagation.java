public class ExceptionPropagation {
    public static void main(String[] args) {
        new ExceptionPropagation().method1();
    }

    public void method1(){
        method2();
    }

    public void method2(){
        throw new ArithmeticException("ArithmeticException is being thrown from method2");
    }
}
