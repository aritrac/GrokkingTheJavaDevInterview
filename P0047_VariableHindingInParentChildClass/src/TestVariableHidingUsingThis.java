public class TestVariableHidingUsingThis {
    public static void main(String[] args) {
        ParentClassNew obj = new ChildClassNew();
        obj.print();
    }
}

class ParentClassNew {
    String x = "Parent's x";

    public void print(){
        System.out.println(x);
    }
}

class ChildClassNew extends ParentClassNew {
    String x = "Child's x";

    public void print(){
        System.out.println(x);
        System.out.println(super.x);
    }
}
