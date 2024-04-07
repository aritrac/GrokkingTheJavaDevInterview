import java.io.*;

public class TestSerialization {
    public static void main(String[] args) {
        Child child = new Child(5,25);
        System.out.println("x : " + child.x);
        System.out.println("y : " + child.y);
        String file = "child3.ser";
        serializeObject(file, child);
        deserializeObject(file);
    }

    public static void serializeObject(String file, Child child) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(child);
            fos.close();
            oos.close();
            System.out.println("The object has been serialized");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deserializeObject(String file) {
        try{
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Child child1 = (Child) ois.readObject();
            fis.close();
            ois.close();
            System.out.println("The object has been deserialized");
            System.out.println("x : " + child1.x);
            System.out.println("y : " + child1.y);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

class Parent implements Serializable {
    int x;
    public Parent(int x){
        this.x = x;
    }
}

class Child extends Parent {
    int y;
    public Child(int x, int y){
        super(x);
        this.y = y;
    }
    //The following two private methods make sure that Serialization behaviour is not supported
    //Also they need to be private so only JVM can see them, and no one else can use them for security
    //The JVM can call these private methods, but other objects cannot. Thus the integrity of the class
    //is maintained and the serialization protocol can continue to work as normal.
    private void writeObject(ObjectOutputStream oos) throws IOException {
        throw new NotSerializableException("Serialization is not supported on this object");
    }

    private void readObject(ObjectInputStream ois) throws IOException {
        throw new NotSerializableException("Serialization is not supported on this object");
    }
}
