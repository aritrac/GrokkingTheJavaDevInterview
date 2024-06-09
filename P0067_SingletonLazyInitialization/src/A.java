public class A {
    private A(){}

    private static A instance;

    /*
    This is lazy initialization, only when getInstance is called, the instance gets created, if not already created,
    but this implementation is not thread safe, two threads accessing the if block in getInstance, can
    both see that instace == null and will create 2 instances of A, so to tackle this problem, we have another
    thread safe version below
     */

    public static A getInstance() {
        if(instance == null){
            instance = new A();
        }
        return instance;
    }

    public synchronized static A getInstanceThreadSafe(){
        if(instance == null){
            instance = new A();
        }
        return instance;
    }

    /*
    Instead of synchronizing the entire method, we can synchronize the portion of the code which creates the new instance
    using double checked locking
     */
    public static A getInstanceThreadSafeTwo() {
        if(instance == null){
            synchronized (A.class){
                if(instance == null){
                    instance = new A();
                }
            }
        }
        return instance;
    }
}
