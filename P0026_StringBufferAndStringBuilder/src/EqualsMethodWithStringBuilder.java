public class EqualsMethodWithStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hello");
        //Here the output will be "Not Equal" as both StringBuilder and StringBuffer does not override
        //equals and hashcode method, unlike String class
        //here equals compares the reference of both, which are different, hence unequal


        /*
        You should use String class if you require immutability, use StringBuffer if you require mutability + Thread safety
        and use StringBuilder if you require mutability and no thread safety.
        */
        if(sb1.equals(sb2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}
