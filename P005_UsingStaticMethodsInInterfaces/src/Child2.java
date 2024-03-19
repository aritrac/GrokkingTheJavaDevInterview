public class Child2 implements Interface1{
    @Override
    public void hi() {
        System.out.println("This is the overridden method from the interface Interface1 which we implement");
    }

    public static void main(String[] args) {
        new Child2().hi(); //This we are able to call since we implemented the method in Child2 class
        new Child2().hallelujah(); //This is a standard invocation of a default method in an interface
    }
}
