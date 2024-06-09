public class Singleton {
    //Private constructor
    private Singleton(){

    }

    //only instance of this class
    private static final Singleton instance = new Singleton();

    //public static method to return the only instance
    public static Singleton getInstance(){
        return instance;
    }
    //Declaring an object method
    public void print(){
        System.out.println("Singleton class print method");
    }
}
