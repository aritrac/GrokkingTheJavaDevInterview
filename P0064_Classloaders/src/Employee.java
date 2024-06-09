/*
Java class loader is based on three principles
1. Delegation Principle
2. Visibility Principle
3. Uniqueness Principle

Suppose, you have created a class Employee.java and compiled this class and Employee.class file is created. Now, you
want to use this class, the first request to load this class will come to System/Application ClassLoader, which will
delegate the request to its parent, Extension ClassLoader which further delegates to Primordial or Bootstrap class loader

Now bootstrap classloader will look for this class in rt.jar, since this class is not there, the request will come to
Extension ClassLoader which looks in jre/lib/ext directory and tries to locate this class there, if this class is found
there then Extension ClassLoader will load this class and Application ClassLoader will not load this class, this has been
done to maintain the uniqueness principle. But if the class is not loaded by Extension Classloader,
then this Employee.class will be loaded by Application ClassLoader from the CLASSPATH
 */
public class Employee {
    public static void main(String[] args) {
        System.out.println(Employee.class.getClassLoader());
        System.out.println(System.class.getClassLoader());
    }
}
