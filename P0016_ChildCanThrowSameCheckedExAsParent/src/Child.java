import java.io.IOException;

public class Child extends Parent{
    @Override
    public void method1() throws IOException {
        System.out.println("The child overridden method also throws same checked exception");
        throw new IOException("throwing same IOException as parent without issues");
    }
}
