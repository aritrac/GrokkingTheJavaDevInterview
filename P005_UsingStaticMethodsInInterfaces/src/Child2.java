public class Child2 implements Interface1{
    @Override
    public void hi() {
        System.out.println("This is the overridden method from the interface Interface1 which we implement");
    }

    public static void main(String[] args) {
        new Child2().hi();
    }
}
