public class UnreachableCode {
    public static void main(String[] args) {
       new UnreachableCode().method1();
       new UnreachableCode().method2();
       new UnreachableCode().method3();
    }

    public void method1(){
        return;
        //System.out.println("This will cause unreachable code");
    }

    public void method2(){
        throw new ArithmeticException("Throwing unchecked exception");
        //System.out.println("This will cause unreachable code");
    }

    public void method3(){
        try{
            System.out.println("This is a sample line");
        }finally {
            System.out.println("This will always execute");
        }
        System.out.println("The program control will come here after finally executes");
    }
}
