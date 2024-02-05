import java.io.IOException;

public class Parent {
    public void method1() throws IOException{
        System.out.println("This class throws checked IOException");
        throw new IOException("Sample IO Exception");
    }
}
