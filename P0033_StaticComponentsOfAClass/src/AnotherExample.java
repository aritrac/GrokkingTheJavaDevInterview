public class AnotherExample {
    int a = 10;
    static int b = 20;
    private static int c = 30;

    static class InnerClass {
        void print(){
            //can't access non-static members
            //System.out.println("Outer class variable a : " + a);

            System.out.println("Outer class variable b : " + b);

            System.out.println("Outer class variable c : " + c);
        }
    }
}

class StaticNestedTestClass {
    public static void main(String[] args) {
        AnotherExample.InnerClass innerClassObject = new AnotherExample.InnerClass();
        innerClassObject.print();
    }
}
