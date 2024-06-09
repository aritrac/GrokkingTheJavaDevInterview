class Parent2 implements Cloneable{
    int x = 20;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Singleton2 extends Parent {
    public static final Singleton2 instance = new Singleton2();
    private Singleton2(){}
    /*
    Just override the parent clone method to return the same instance if anyone tries to clone the Singleton
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return instance;
    }
}

public class TestSingleton2 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Singleton2 instance1 = Singleton2.instance;
        Singleton2 instance2 = (Singleton2) instance1.clone();

        System.out.println("Instance1 hashcode : " + instance1.hashCode());
        System.out.println("Instance2 hashcode : " + instance2.hashCode());
    }
}
