import java.io.IOException;

public class CheckedExceptions {
//    public static void method1() { //Since IOException is a checked exception, it needs to be declared using throws
//        throw new IOException("IO Exception Occurred");
//    }
    public static void method1() throws IOException {
        throw new IOException("IO Exception occurred");
    }

    public static void main(String[] args) {
        try {
            method1();
        }catch(IOException ex){
            System.out.println("IOException is now handled");
        }
    }
}
