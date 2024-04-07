import java.io.*;

public class TestSerialization {
    public static void main(String[] args) {
        Child child = new Child(20,40);
        System.out.println("x : " + child.x);
        System.out.println("y : " + child.y);
        String file = "child1.ser";
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

class Parent {
    int x;
    public Parent(int x){
        this.x = x;
        System.out.println("Parent class one-arg constructor");
    }

    //The no-arg constructor is necessary for the child to be serialized
    //even if the parent class is not defined as serializable
    public Parent(){
        x = 100;
        System.out.println("Parent class no-arg constructor");
    }
}

class Child extends Parent implements Serializable {
    int y;
    public Child(int x, int y){
        super(x);
        this.y=y;
    }
}
