import java.io.IOException;

public class Parent {
    public void method1() throws IOException{
        System.out.println("This throws a checked exception");
        throw new IOException("checked IOException");
    }
}
