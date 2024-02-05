public interface Interface1 {
    default void hallelujah(){ //this is default
        System.out.println("say hallelujah");
    }
    static void hello(){  //this is public
        System.out.println("Hello from interface static method");
    }

    void hi(); //this is by default public and abstract
}
