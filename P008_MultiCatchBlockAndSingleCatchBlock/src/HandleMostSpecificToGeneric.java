import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandleMostSpecificToGeneric {
    public static void main(String[] args) {
//        try{
//            FileReader f = new FileReader("C:\\temp\\dummy.txt");
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }catch(FileNotFoundException fnfe){  Since we have handled Exception before FileNotFoundException, this is illegal now
//            fnfe.printStackTrace();
//        }finally {
//            System.out.println("Inside finally block");
//        }
        try{
            FileReader f = new FileReader("C:\\temp\\dummy.txt");
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }catch(Exception ex){   //The above example, should be written as follows, starting from most granular to most generic catch blocks
            ex.printStackTrace();
        }finally {
            System.out.println("Inside finally block");
        }
    }
}
