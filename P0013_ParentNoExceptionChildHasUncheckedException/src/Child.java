public class Child extends Parent{
    @Override
    public void method1(){ //does not declare any exception which is valid,
        //but can throw unchecked exception
        int a = 10/0;
    }

    public static void main(String[] args) {
        new Child().method1();
    }
}
