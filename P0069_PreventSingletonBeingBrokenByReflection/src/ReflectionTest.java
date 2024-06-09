import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
We will try to invoke the private constructor of A using Reflection and then we will try to
instantiate another instance of A, when already an instance is present.

But in this case, the private constructor of A will check if instance is null or not,
and won't let Reflection create another instance, hence preserving Singleton pattern
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
