import java.io.FileNotFoundException;
import java.io.FileReader;

public class DontCallFinally {
    public static void main(String[] args) {
        System.out.println("I am going to read from a file");
        try{
            System.exit(0); //Also if JVM crashes, it wont be run
            FileReader f = new FileReader("C:\\temp\\dummy.txt");
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }finally {
            System.out.println("This is not going to be printed");
        }
    }
}
