import java.io.IOException;

public class Parent {
    public void method1() throws IOException {
        System.out.println("The parent throws checked exception");
        throw new IOException("Parent throws checked exception");
    }
}
