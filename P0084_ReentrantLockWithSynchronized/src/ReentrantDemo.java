public class ReentrantDemo {
    public synchronized void m1(){
        m2();
        System.out.println("inside m1()");
    }

    public synchronized void m2(){
        m3();
        System.out.println("inside m2()");
    }

    public synchronized void m3(){
        System.out.println("inside m3()");
    }
}
