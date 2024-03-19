public class Main {
    //static variables
    static Integer STATIC_INTEGER_VARIABLE;
    Integer nonStaticVariable;

    //static block
    static {
        STATIC_INTEGER_VARIABLE = 10;
    }
    //instance block
    {
        nonStaticVariable = 10;
    }
    //static method
    public static void main(String[] args) {
        //we can create static inner class object without creating outer class object
        Main.InnerClassExample nestedClassObject = new Main.InnerClassExample();
        //The above is not possible with normal non-static inner classes

        //We cannot access non-static member from a static context
        //System.out.printf("nonStaticVariable value = " + nonStaticVariable);

        //for creating non-static inner class instance, we need a outer class instance as well
        Main.NonStaticInnerClassExample nestedInstanceClassObject = new Main().new NonStaticInnerClassExample();

    }
    //static inner classes can access static members of the parent class
    static class InnerClassExample{

    }

    //non static inner class
    class NonStaticInnerClassExample{

    }
}