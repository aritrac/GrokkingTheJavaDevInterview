public class CreateCustomException {
    public static void main(String[] args) {
        try{
            method1();
        }catch(MyException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void method1() throws MyException{
        throw new MyException("My own custom exception");
    }
}

class MyException extends Exception {
    public MyException(String s){
        super(s);
    }
}
