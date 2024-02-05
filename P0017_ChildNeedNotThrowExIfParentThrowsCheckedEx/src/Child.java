public class Child extends Parent{
    @Override
    public void method1() {
        System.out.println("This overridden method doesn't need to throw any checked exception");
    }
}
