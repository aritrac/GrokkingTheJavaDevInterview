public class VariableShadowing {
    //instance variables
    String name = "Mike";
    int age = 15;

    public void display(){
        //local variables shadows the instance variables of the same name
        String name = "John";
        int age = 20;

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {
        VariableShadowing obj = new VariableShadowing();
        obj.display();
    }
}
