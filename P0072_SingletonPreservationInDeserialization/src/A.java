import java.io.Serial;
import java.io.Serializable;

public class A implements Serializable {
    @Serial
    private static final long serialVersionUID = -2020L;

    private A(){}

    public static final A instance = new A();

    /*
    On using this method, when we deserialize, we get the same object back which we serialized.
    The hashcodes will now match
     */
    @Serial
    protected Object readResolve(){
        System.out.println("readResolve() method is called");
        return instance;
    }
}
