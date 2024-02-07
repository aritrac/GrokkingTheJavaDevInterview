import java.io.Serializable;

public class MarkerInterfaces {
    public static void main(String[] args) {
        //MarkerInterfaces are empty interfaces which lets you call certain methods from certain classes
        //for example Cloneable interface, lets you call the clone() method on an object, which
        //if you dont implement, you will get CloneNotSupportedException
        /*
        Same is true with writeObject(Object) method of ObjectOutputStream class.
        Here, obj instanceOf Serializable is used to check whether the class implements Serializable interface or not.
        If class does not implement Serializable interface then NotSerializableException is thrown.
         */
        CloneSupport c1 = new CloneSupport();
        c1.clone();

    }
}

class CloneSupport implements Cloneable{

    @Override
    public CloneSupport clone() {
        try {
            return (CloneSupport) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

class SerializableSupport implements Serializable{

}
