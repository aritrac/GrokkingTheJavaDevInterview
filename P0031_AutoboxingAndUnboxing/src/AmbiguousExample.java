public class AmbiguousExample {
    public static void main(String[] args) {
        //Here we are having two methods, which can both accept integers,
        //even though the datatypes differ, but due to autoboxing and unboxing
        //the compiler is confused as to which method to call
        AmbiguousExample object = new AmbiguousExample();
        //The below call will lead to ambiguity as to which method to call
        //object.print(5,10);
    }
    public void print(int a, long b){
        System.out.println("Method 1");
    }

    public void print(long a, int b){
        System.out.println("Method 2");
    }
}
