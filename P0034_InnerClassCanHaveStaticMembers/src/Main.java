class OuterClass {
    static int outer_x = 10;
    int outer_y = 20;
    private int outer_z = 30;

    class InnerClass {
        void print(){
            OuterClass outerClass = new OuterClass();
            OuterClass.InnerClass innerClass = outerClass.new InnerClass();
            innerClass.print();
        }

        static int inner_x = 20;
        static void print2(){
            System.out.println("Working");
        }
    }
}