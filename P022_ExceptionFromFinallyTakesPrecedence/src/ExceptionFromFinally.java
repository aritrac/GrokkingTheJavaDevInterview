public class ExceptionFromFinally {
    public static void main(String[] args) {
        try{
            int a = 10/0;
        }catch(Exception ex){
            System.out.println("This is going to be printed, but exception is not going to be reported");
            throw ex; //This will not be reported
        }
        finally { //Exceptions thrown from finally takes precendence over other exceptions
            throw new IndexOutOfBoundsException("This is index out of bounds exception"); //This will be reported
        }
    }
}
