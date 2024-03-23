enum Employee {
    Mike(15),
    John(20),
    Lisa(12),
    Dave(25);

    private int age;

    int getAge(){
        return age;
    }
    //Enums can only have private constructors
    private Employee(int age){
        this.age = age;
        System.out.println("Constructor called for : " + this.toString());
    }
}

public class Test{
    public static void main(String[] args) {
        System.out.println("Age of Lisa is : " + Employee.Lisa.getAge());
    }
}
