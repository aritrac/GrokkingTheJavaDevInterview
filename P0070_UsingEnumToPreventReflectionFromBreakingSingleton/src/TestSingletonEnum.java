/*
    The other solution to prevent Singleton from Reflection is using Enums, as its constructor cannot be accessed
    via Reflection, JVM internally handles the creation and invocation of enum constructor
 */
public class TestSingletonEnum {
    public static void main(String[] args) {
        SingletonEnum.INSTANCE.print();
    }
}
