import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
We will try to invoke the private constructor of A using Reflection and then we will try to
instantiate another instance of A, when already an instance is present,
which breaks the singleton design pattern
 */

public class ReflectionTest {
    public static void main(String[] args) {
        A instance1 = A.instance;
        A instance2 = null;
        Constructor[] constructors = A.class.getDeclaredConstructors();

        for(Constructor constructor : constructors){
            constructor.setAccessible(true);
            try{
                instance2 = (A) constructor.newInstance();
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Instance1 hashcode : " + instance1.hashCode());
        System.out.println("Instance2 hashcode : " + instance2.hashCode());
    }
}
