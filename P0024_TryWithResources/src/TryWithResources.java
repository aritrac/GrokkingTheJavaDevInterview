import java.io.FileReader;

public class TryWithResources {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("C:\\temp\\dummy.txt");){
            //This is your other program statements dealing with the opened resource such as a file
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
