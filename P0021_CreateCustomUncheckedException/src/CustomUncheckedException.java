public class CustomUncheckedException {
    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        try{
            throw new MyCustomUncheckedException("This is my custom unchecked exception");
        }catch(MyCustomUncheckedException ex){
            System.out.println(ex.getMessage());
        }
    }
}

class MyCustomUncheckedException extends RuntimeException{
    public MyCustomUncheckedException(String s){
        super(s);
    }
}
