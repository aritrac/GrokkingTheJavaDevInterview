public class A {
    private A(){}

    private static A instance;
    /*
    Here the instance will be created at the time of class loading, even if no one needs it
     */
    static {
        try {
            instance = new A();
        }catch(Exception e){
            throw new RuntimeException("Exception while creating singleton object");
        }
    }

    public static A getInstance(){
        return instance;
    }
}
