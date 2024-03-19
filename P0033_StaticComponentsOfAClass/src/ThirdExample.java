public class ThirdExample {
    static int x = 20;

    static class InnerClass {
        static int y = 30;

        static void display(){
            System.out.println("Outer X : " + x);
        }
    }
}

class StaticNestedTestBClass {
    public static void main(String[] args) {
        ThirdExample.InnerClass.display();
        System.out.println(ThirdExample.InnerClass.y);
    }
}
