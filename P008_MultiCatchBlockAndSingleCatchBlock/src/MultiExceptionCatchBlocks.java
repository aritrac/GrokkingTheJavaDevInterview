import java.io.FileNotFoundException;
import java.io.FileReader;

public class MultiExceptionCatchBlocks {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("C:\\temp\\dummy.txt");
//        }catch(Exception | FileNotFoundException ex){   //this is not going to work, as types in multicatch should be disjoint
//            ex.printStackTrace();
//        }
        }catch(FileNotFoundException | NullPointerException ex){ //This is going to work, as types are disjoint, no parent-child relation exists
            ex.printStackTrace();
        }
    }
}
