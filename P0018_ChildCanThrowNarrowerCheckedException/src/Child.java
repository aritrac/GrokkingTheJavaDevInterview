import java.io.IOException;

public class Child extends Parent{
    @Override
    public void method1() throws IOException{
        System.out.println("This method throws narrower checked exception which is all right");
        throw new IOException("Some IOException occurred");
    }

    public static void main(String[] args) throws IOException {
        new Child().method1();
    }
}
