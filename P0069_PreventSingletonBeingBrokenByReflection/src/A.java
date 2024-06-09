public class A {
    private A(){
        if(A.instance != null){
            throw new InstantiationError("The object creation is not allowed");
        }
    }

    public static A instance = new A();
}
