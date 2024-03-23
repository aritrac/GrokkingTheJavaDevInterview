public class VariableShadowingUsingThis {
    //instance variables
    String name = "Mike";
    int age = 15;

    public void display(){
        //local variables
        String name = "John";
        int age = 20;

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }

    public static void main(String[] args) {
        VariableShadowingUsingThis obj = new VariableShadowingUsingThis();
        obj.display();
    }
}
