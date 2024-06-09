import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSingletonBreakage{
    public static void main(String[] args) {
        A instance = A.instance;
        String file = "singleton.ser";
        try{
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance);
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            A instance2  = (A) ois.readObject();
            /*
            Here we will see the serialized object hashcode and the deserialized object hashcode will be same
            ,which should be the case for a singleton object
             */
            System.out.println("Instance1 hashcode : " + instance.hashCode());
            System.out.println("Instance2 hashcode : " + instance2.hashCode());
            ois.close();
            fis.close();
        } catch (Exception e) {
            System.out.println("An error occurred");
        }
    }
}
