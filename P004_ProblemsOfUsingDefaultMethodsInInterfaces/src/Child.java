public class Child implements Interface1,Interface2{
    /*
    This is how you override one of the default methods from the interfaces
     */
    @Override
    public void hello() {
        System.out.println("inside Child class hello method");
        Interface1.super.hello();
    }

    public void hello2(){
        System.out.println("inside Child class hello2 method");
        Interface2.super.hello();
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.hello();
        child.hello2();
    }
}
