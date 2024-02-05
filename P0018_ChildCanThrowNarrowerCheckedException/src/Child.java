import java.io.IOException;

public class Child extends Parent{
    @Override
    public void method1() throws IOException{
        System.out.println("This method throws narrower checked exception which is all right");
    }
}
