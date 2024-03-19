public class AnotherExample {

}

class OuterClassNew{
    int var1 = 10;
    static int var2 = 20;

    public void print(){
        int print_j = 10;
        final int print_k = 20;

        class Inner {
            public void display(){
                //block variable print_j cannot be modified from inner class, as it should be final or effectively final
                //print_j = 50;

                //class level variable can still be modified
                var1 = 60;
                var2 = 70;
                //we cannot print block variable as it has to be final or effectively final
                //System.out.println(print_j);
            }
        }
        print_j = 20;
        Inner inner = new Inner();
        inner.display();
    }
}
