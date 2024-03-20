public class TestAnonymousInnerClass {
    public static void main(String[] args) {
        Parent parent = new Parent(){
            public void display() {
                System.out.println("display method in anonymous inner class");
            }
        };
        parent.display();
    }
}

class Parent {
    public void display() {
        System.out.println("display method in parent class");
    }
}
