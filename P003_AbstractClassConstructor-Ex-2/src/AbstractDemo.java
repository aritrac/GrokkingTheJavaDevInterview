public class AbstractDemo extends MyAbstractClass{
    public AbstractDemo(int x, int y){
        super(x,y);
    }

    public static void main(String[] args) {
        AbstractDemo obj = new AbstractDemo(5,10);
        obj.print();
    }
}
